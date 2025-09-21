package research;

public class Main {
    public static void main(String[] args) {
        ResearchPaper fullPaper = new FullResearchPaper();
        ResearchPaperView paperView = new ResearchPaperView(fullPaper);
        paperView.display();
    }
}
