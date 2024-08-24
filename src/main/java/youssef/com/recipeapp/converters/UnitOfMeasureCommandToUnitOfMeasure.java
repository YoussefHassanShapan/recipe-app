package youssef.com.recipeapp.converters;


import io.micrometer.common.lang.Nullable;
import lombok.Synchronized;
import org.springframework.stereotype.Component;
import youssef.com.recipeapp.commands.UnitOfMeasureCommand;
import youssef.com.recipeapp.domain.UnitOfMeasure;
import org.springframework.core.convert.converter.Converter;
import io.micrometer.common.lang.Nullable;

@Component
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand source) {
        if (source == null) {
            return null;
        }

        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(source.getId());
        uom.setDescription(source.getDescription());
        return uom;
    }
}
