package com.firstapp.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();

        recipes1.add(new Recipes("Chicken Rolls","200 gm chopped into cubes chicken \n" +
                "1 medium chopped tomato \n" +
                "1/2 pinch red chilli powder \n" +
                "2 tablespoon vegetable oil \n" +
                "1/2 cut into strips cucumber \n" +
                "1/2 tablespoon chopped coriander leaves \n" +
                "1 large thinly sliced onion \n" +
                "2 medium chopped green chilli \n" +
                "2 pinches garam masala powder \n" +
                "1 lemon wedges \n" +
                "1 teaspoon tomato ketchup \n" +
                "1 tablespoon green chilli sauce \n","Method",
                 "Step 1\n" +
                         "Take a bowl and add chicken, chilli-garlic paste, ginger-garlic paste, salt, cumin and coriander powder in it. Mix them well and let it marinate for an hour.\n" +
                         "\n" +
                         "Step 2\n" +
                         "Keep a pan on medium flame and add 2 tbsp oil in it. Once the oil is hot, add marinated chicken strips in it and cook for 2 minutes. Now, add onion, capsicum, green chillies, and tomatoes. Also, add salt as per taste. Mix everything well and saute for around 5 to 7 minutes. Take out the chicken after it is well cooked on all sides. Keep aside.\n" +
                         "\n" +
                         "Step 3\n" +
                         "In a small bowl, beat 2 eggs and add salt in it. Mix well.\n" +
                         "\n" +
                         "Step 4\n" +
                         "Take a flat pan and heat ¾ tbsp of oil over medium flame. Put half of the egg mixture in the pan and place a roti on top of it.\n" +
                         "\n" +
                         "Step 5\n" +
                         "Now, flip the roti and turn the heat off. Place half of the chicken mixture in the middle of the roti. Also, sprinkle some chaat masala and drizzle 1 tsp lemon juice over the chicken.\n" +
                         "\n" +
                         "Step 6\n" +
                         "Next, form a roll. Remove the roll from the pan and cover half of it with butter paper.\n" +
                         "\n" +
                         "Step 7\n" +
                         "Repeat steps 4 to 6 with the second parantha.\n" +
                         "\n" +
                         "Step 8\n" +
                         "Serve them hot with mint chutney.",R.drawable.chickenroll));


        recipes1.add(new Recipes("Donuts","1 c. whole milk \n" +
                "1/4 c. plus 1 tsp. granulated sugar, divided \n" +
                "1 packet (or 2 1/4 tsp.) active dry yeast \n" +
                "4 c. all-purpose flour, plus more if needed \n" +
                "1/2 tsp. kosher salt \n" +
                "6 tbsp. melted butter \n" +
                "2 large eggs \n" +
                "1/2 tsp. pure vanilla extract \n" +
                "Canola or vegetable oil, for frying","Method","\n" +
                "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                "Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\n" +
                "Line a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\n" +
                "Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.donut));

        recipes1.add(new Recipes("Dosa","3 cups rice \n" +
                "1 cup urad daal (split, skinless black gram) \n" +
                "3/4 teaspoon fenugreek seeds \n" +
                "Salt (to taste) \n" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                        "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                        "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                        "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa));

        recipes1.add(new Recipes("Pancakes","1 1/4 cups milk \n" +
                "1 egg \n" +
                "3 tablespoons butter melted \n" +
                "1 1/2 cups all-purpose flour \n" +
                "3 1/2 teaspoons baking powder \n" +
                "1 teaspoon salt \n" +
                "1 tablespoon white sugar \n","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                        "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancake));

        recipes1.add(new Recipes("Pasta \n","1 tsp oil" +
                "1 tsp butter \n" +
                "2 clove garlic, finely chopped \n" +
                "1 inch ginger, finely chopped \n" +
                "½ onion, finely chopped \n" +
                "1 cup tomato pulp \n" +
                "¼ tsp turmeric / haldi \n" +
                "½ tsp kashmiri red chilli powder \n" +
                "2 tbsp tomato sauce \n" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely." +
                        "now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute." +
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well." +
                        "finally, serve masala pasta indian style hot topped with cheese if required.",R.drawable.pasta));

        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this,recipes1);
        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myrecyclerView.setAdapter(myAdapter);


    }




}