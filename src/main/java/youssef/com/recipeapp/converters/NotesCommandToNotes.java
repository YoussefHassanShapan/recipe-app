package youssef.com.recipeapp.converters;


import lombok.Synchronized;
import org.springframework.stereotype.Component;
import youssef.com.recipeapp.commands.NotesCommand;
import youssef.com.recipeapp.domain.Notes;
import org.springframework.core.convert.converter.Converter;
import io.micrometer.common.lang.Nullable;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand source) {
        if(source == null) {
            return null;
        }

        final Notes notes = new Notes();
        notes.setId(source.getId());
        notes.setRecipeNotes(source.getRecipeNotes());
        return notes;
    }
}
