package hacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hacks.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
