package nextstep.subway.line.domain;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LineRepository extends JpaRepository<Line, Long> {

    @Query(value = "select l from Line l where l.id >= ?1 ")
    List<Line> findAll(Long id, Pageable pageable);
}
