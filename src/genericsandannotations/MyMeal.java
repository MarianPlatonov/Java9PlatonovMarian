/*
 * Class MyMeal
 */
package genericsandannotations;

/**
 *
 * @author Marian Platonov
 */
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MyMeal {

    /**
     *
     * @author BKL
     */
    @Repeatable(MealContainer.class)
    public @interface Meal {

        String meal();

        String mainDish();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface MealContainer {

        Meal[] value();
    }

    @Meal(meal = "breakfast", mainDish = "cereal")
    @Meal(meal = "lunch", mainDish = "pizza")
    @Meal(meal = "dinner", mainDish = "salad")
    public interface Diet {
    }

    public void evaluateDiet() {

        Meal[] meals = Diet.class.getAnnotationsByType(Meal.class);
        System.out.println("---------My little body secrets!-----------");
        System.out.println("I eat only " + meals.length + " times a day!");
        for (Meal dietType : meals) {
            System.out.println("For " + dietType.meal()
                    + " time my diet consist in " + dietType.mainDish());

        }
    }

    public static void main(String[] args) {

        MyMeal obj = new MyMeal();
        obj.evaluateDiet();

    }

}

/*
Answer: First of all we have a problem with “…”  we must comment them.
        We must add @Repeatable meta-annotation
        We must make an import for java.lang.annotation.Repeatable
        We must define a container annotation type.
import java.lang.annotation.Repeatable;
    @Repeatable(MealContainer.class)
    public @interface Meal {
    //…
    }
    @interface MealContainer {
        Meal[] value();
    }
    @Meal(meal = "breakfast", mainDish = "cereal")
    @Meal(meal = "lunch", mainDish = "pizza")
    @Meal(meal = "dinner", mainDish = "salad")
    public void evaluateDiet() {
    //…            
        }
 */