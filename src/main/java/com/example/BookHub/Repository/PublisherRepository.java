package com.example.BookHub.Repository;

import org.springframework.stereotype.Repository;
import com.example.BookHub.model.Publisher;
import java.util.ArrayList;

@Repository
public interface PublisherRepository {

    ArrayList<Publisher> getPublishers();

    Publisher getPublisherById(int publisherId);

    Publisher addPublisher(Publisher publisher);

    Publisher updatePublisher(int publisherId, Publisher publisher);

    void deletePublisher(int publisherId);
}
