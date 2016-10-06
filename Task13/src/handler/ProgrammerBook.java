package handler;

/**
 * Created by Сергей on 06.10.2016.
 */
public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title,String author,int price,int isbn,String language,int level){
        super(title,author,price,isbn);
        this.language = language;
        this.level = level;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        ProgrammerBook that = (ProgrammerBook) o;

        if (level != that.level)
            return false;

        return language.equals(that.language);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                '}';
    }


}
