package batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.stereotype.Service;

@Service
public class MyItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person item) throws ValidationException {
        item.setName(item.getName().toUpperCase());
        return item;
    }
}
