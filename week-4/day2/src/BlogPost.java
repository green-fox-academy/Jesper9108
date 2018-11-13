public class BlogPost {

    public BlogPost() {

    }

    String authorname;
    String title;
    String text;
    String publicationDate;

    public static void main(String[] args) {

        BlogPost post1 = new BlogPost();
        BlogPost post2 = new BlogPost();
        BlogPost post3 = new BlogPost();

        post1.authorname = "John Kovac";
        post1.publicationDate = "2001.06.08";
        post1.text = "Lorem ipsum";
        post1.title = "Lorem Ipsum";

        post2.authorname = "Tim Urban";
        post2.publicationDate = "2010.10.10";
        post2.title = "wait but why";
        post2.text = "A popular long-form...";

    }
}
