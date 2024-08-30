package youssef.com.recipeapp.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import youssef.com.recipeapp.domain.Difficulty;

@Component
public class StringToDifficultyConverter implements Converter<String, Difficulty> {
    @Override
    public Difficulty convert(String source) {
        try {
            return Difficulty.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Handle the conversion error (return a default value or throw an exception)
            return null; // or throw a custom exception
        }
    }
}
