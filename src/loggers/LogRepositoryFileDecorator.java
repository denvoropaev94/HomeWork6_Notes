package loggers;

import model.Note;
import model.Repository;

import java.util.List;

public class LogRepositoryFileDecorator implements Repository {
    Repository repository;
    Logable logable;

    public LogRepositoryFileDecorator(Repository repository, Logable logable) {
        this.repository = repository;
        this.logable = logable;
    }

    @Override
    public List<Note> getAllNotes() {
        logable.saveLog("вывод всех заметок");
        return repository.getAllNotes();
    }

    @Override
    public void createNote(Note note) {
        logable.saveLog("Создание заметки");
        repository.createNote(note);

    }

    @Override
    public void updateNote(Note note) {
        logable.saveLog("Редактирование заметки: " + note.getId());
        repository.updateNote(note);

    }

    @Override
    public void deleteNote(Note note) {
        logable.saveLog("Удаление заметки: " + note.getId());
        repository.deleteNote(note);
    }
    @Override
    public Note noteRead(String id) {
        logable.saveLog("Чтение заметки: " + id);
        return repository.noteRead(id);
    }

    @Override
    public void exit() {
        logable.saveLog("Выход из приложения");
    }
}
