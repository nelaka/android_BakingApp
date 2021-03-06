package com.example.android.android_bakingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.android_bakingapp.model.Recipe;
import com.example.android.android_bakingapp.utils.Utils;

public class MainActivity extends AppCompatActivity implements RecipesFragment.OnRecipeInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0f);
    }

    @Override
    public void onRecipeInteraction(Recipe recipe) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(Utils.RECIPE_NAME, recipe.getRecipeName());
        intent.putParcelableArrayListExtra(Utils.BUNDLE_INGREDIENTS, recipe.getIngredients());
        intent.putParcelableArrayListExtra(Utils.BUNDLE_STEPS, recipe.getSteps());

        startActivity(intent);
    }
}
