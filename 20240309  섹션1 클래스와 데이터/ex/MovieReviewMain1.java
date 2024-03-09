package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {

        MovieReview inception = new MovieReview();
        MovieReview[] reviews = new MovieReview[1];
        reviews[0] = inception;

        inception.title = "인셉션";
        inception.review = "재밌다";

        for (MovieReview MR : reviews){
            System.out.println("제목 : " + MR.title + " 리뷰 : " + MR.review);
        }
    }
}
