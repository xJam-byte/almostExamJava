package com.example.almostexam.config;

import java.io.File;

public class files {
    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("C://SomeDir");
        // если объект представляет каталог
        if (dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {

                if (item.isDirectory()) {

                    System.out.println(item.getName() + "  \t folder");
                } else {

                    System.out.println(item.getName() + "\t file");
                }
            }

        }



//        // определяем объект для каталога
//        File dir = new File("C://SomeDir//NewDir");
//        boolean created = dir.mkdir();
//        if(created)
//            System.out.println("Folder has been created");
//        // переименуем каталог
//        File newDir = new File("C://SomeDir//NewDirRenamed");
//        dir.renameTo(newDir);
//        // удалим каталог
//        boolean deleted = newDir.delete();
//        if(deleted)
//            System.out.println("Folder has been deleted");
    }
//    boolean createNewFile(): создает новый файл по пути, который передан в конструктор. В случае удачного создания возвращает true, иначе false
//
//    boolean delete(): удаляет каталог или файл по пути, который передан в конструктор. При удачном удалении возвращает true.
//
//    boolean exists(): проверяет, существует ли по указанному в конструкторе пути файл или каталог. И если файл или каталог существует, то возвращает true, иначе возвращает false
//
//    String getAbsolutePath(): возвращает абсолютный путь для пути, переданного в конструктор объекта
//
//    String getName(): возвращает краткое имя файла или каталога
//
//    String getParent(): возвращает имя родительского каталога
//
//    boolean isDirectory(): возвращает значение true, если по указанному пути располагается каталог
//
//    boolean isFile(): возвращает значение true, если по указанному пути находится файл
//
//    boolean isHidden(): возвращает значение true, если каталог или файл являются скрытыми
//
//    long length(): возвращает размер файла в байтах
//
//    long lastModified(): возвращает время последнего изменения файла или каталога. Значение представляет количество миллисекунд, прошедших с начала эпохи Unix
//
//    String[] list(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
//
//    File[] listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
//
//    boolean mkdir(): создает новый каталог и при удачном создании возвращает значение true
//
//    boolean renameTo(File dest): переименовывает файл или каталог

}
