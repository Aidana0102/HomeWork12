package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal animal=context.getBean("CallAnimal",Animal.class);
        Person person= context.getBean("PersonWithHisAnimal",Person.class);



        System.out.println( person.getName() +"  age:  "+ person.getAge()+"    favourite animal:" +animal.getClass()  ) ;
        animal.AnimalMinus();
        animal.AnimalPlus();



    }
}
