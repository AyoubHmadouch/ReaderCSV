package services;

import java.io.File;
import java.util.List;

public interface Reader {
    List<Object> readFile(File file) throws Exception;
}
