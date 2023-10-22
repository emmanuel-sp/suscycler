package hacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hacks.model.Bin;
import org.springframework.stereotype.Repository;

@Repository
public interface BinRepository extends JpaRepository<Bin, Long> {

}
