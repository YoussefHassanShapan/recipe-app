package youssef.com.recipeapp.converters;
import io.micrometer.common.lang.Nullable;
import org.springframework.core.convert.converter.Converter;

import lombok.Synchronized;
import org.springframework.stereotype.Component;
import youssef.com.recipeapp.commands.CategoryCommand;
import youssef.com.recipeapp.domain.Category;

@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if (source == null) {
            return null;
        }

        final CategoryCommand categoryCommand = new CategoryCommand();

        categoryCommand.setId(source.getId());
        categoryCommand.setDescription(source.getDescription());

        return categoryCommand;
    }
}
