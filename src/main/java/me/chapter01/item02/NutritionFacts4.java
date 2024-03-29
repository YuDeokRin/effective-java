package me.chapter01.item02;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NutritionFacts4 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {


        NutritionFacts4 nutritionFacts4 = new NutritionFacts4Builder()
                .servingSize(100)
                .servings(101)
                .build();
    }
}
