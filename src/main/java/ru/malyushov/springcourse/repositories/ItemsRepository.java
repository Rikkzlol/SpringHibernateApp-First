package ru.malyushov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.malyushov.springcourse.models.Item;
import ru.malyushov.springcourse.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findByItemName(String itemName);

    //person.getItems()
    List<Item> findByOwner(Person owner);



}
