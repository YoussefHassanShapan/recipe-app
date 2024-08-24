package youssef.com.recipeapp.converters;


import io.micrometer.common.lang.Nullable;
import lombok.Synchronized;
import org.springframework.stereotype.Component;
import youssef.com.recipeapp.commands.UnitOfMeasureCommand;
import youssef.com.recipeapp.domain.UnitOfMeasure;
import org.springframework.core.convert.converter.Converter;
import io.micrometer.common.lang.Nullable;

@Component
public class UnitOfMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasureCommand convert(UnitOfMeasure unitOfMeasure) {

        if (unitOfMeasure != null) {
            final UnitOfMeasureCommand uomc = new UnitOfMeasureCommand();
            uomc.setId(unitOfMeasure.getId());
            uomc.setDescription(unitOfMeasure.getDescription());
            return uomc;
        }
        return null;
    }
}
