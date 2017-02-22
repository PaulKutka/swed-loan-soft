package lt.swedbank.itacademy.loansoft.repository;

import lt.swedbank.itacademy.loansoft.bean.entity.TestClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by paulius on 17.2.23.
 */

@Repository
public interface TestRepository extends CrudRepository<TestClass, Long> {
}
