import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeListener;

public class Main {
    public static void main(String[] args) {
//     Person sarah = new Person("Sarah", 30, 101);
//        System.out.println("sarah.getAge() = " + sarah.getAge());
//        sarah.setAge(34);
        Person[] people = {
                new Person("Сара", 30, 112),
                new Person("Джон", 12, 113),
                new Person("Иван", 12, 113),
                new Person("Том", 12, 113),
                new Person("Джо", 23, 116),
        };
        System.out.println("Размер списка = " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя "+ person.getName() + " Возраст " + person.getAge() + " Телефон " + person.getPhoneNumber());
            
        }
        System.out.println("Размер списка покупателей = " + people.length);
        Customer[] customers = {
                new Customer("Сара", 30, 112, 111321),
                new Customer("Джон", 12, 113, 111322),
                new Customer("Иван", 12, 113, 111323),
                new Customer("Том", 12, 115, 111323),

        };
        for (int i = 0; i < people.length; i++) {
            Customer customer = customers[i];
//            System.out.println("Имя "+ customer.getName() + " Возраст " + customer.getAge() + " Телефон " + customer.getPhoneNumber());

        }

        Gamer[] gamers = {
                new Gamer("Джо", 23, 116, "PS")
                new Gamer("Джон", 23, 113, "PS")
        }
        PrintService printService = new PrintService() {
            printService.print(people);
            printService.print(customers);
            printService.print(gamers)
//            @Override
//            public String getName() {
//                return null;
//            }
//
//            @Override
//            public DocPrintJob createPrintJob() {
//                return null;
//            }
//
//            @Override
//            public void addPrintServiceAttributeListener(PrintServiceAttributeListener listener) {
//
//            }
//
//            @Override
//            public void removePrintServiceAttributeListener(PrintServiceAttributeListener listener) {
//
//            }
//
//            @Override
//            public PrintServiceAttributeSet getAttributes() {
//                return null;
//            }
//
//            @Override
//            public <T extends PrintServiceAttribute> T getAttribute(Class<T> category) {
//                return null;
//            }
//
//            @Override
//            public DocFlavor[] getSupportedDocFlavors() {
//                return new DocFlavor[0];
//            }
//
//            @Override
//            public boolean isDocFlavorSupported(DocFlavor flavor) {
//                return false;
//            }
//
//            @Override
//            public Class<?>[] getSupportedAttributeCategories() {
//                return new Class[0];
//            }
//
//            @Override
//            public boolean isAttributeCategorySupported(Class<? extends Attribute> category) {
//                return false;
//            }
//
//            @Override
//            public Object getDefaultAttributeValue(Class<? extends Attribute> category) {
//                return null;
//            }
//
//            @Override
//            public Object getSupportedAttributeValues(Class<? extends Attribute> category, DocFlavor flavor, AttributeSet attributes) {
//                return null;
//            }
//
//            @Override
//            public boolean isAttributeValueSupported(Attribute attrval, DocFlavor flavor, AttributeSet attributes) {
//                return false;
//            }
//
//            @Override
//            public AttributeSet getUnsupportedAttributes(DocFlavor flavor, AttributeSet attributes) {
//                return null;
//            }
//
//            @Override
//            public ServiceUIFactory getServiceUIFactory() {
//                return null;
//            }
        }


    }

}