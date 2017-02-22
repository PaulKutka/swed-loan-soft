package lt.swedbank.itacademy.loansoft.bean.entity;

import javax.persistence.*;

/**
 * Created by paulius on 17.2.22.
 */
@Entity(name = "test")
public class TestClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
