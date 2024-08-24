package youssef.com.recipeapp.converters;


import lombok.Synchronized;
import org.springframework.stereotype.Component;
import youssef.com.recipeapp.commands.NotesCommand;
import youssef.com.recipeapp.domain.Notes;
import org.springframework.core.convert.converter.Converter;
import io.micrometer.common.lang.Nullable;

@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand>{

    @Synchronized
    @Nullable
    @Override
    public NotesCommand convert(Notes source) {
        if (source == null) {
            return null;
        }

        final NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(source.getId());
        notesCommand.setRecipeNotes(source.getRecipeNotes());
        return notesCommand;
    }
}
