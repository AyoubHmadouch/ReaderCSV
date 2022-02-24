package services;

import models.Deal;

import java.io.File;
import java.util.List;

public interface Reader {
    List<Deal> readFile(File file) throws Exception;
}
