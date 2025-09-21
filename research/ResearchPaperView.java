package research;

public  class ResearchPaperView {
    private ResearchPaper researchPaper;

    public ResearchPaperView(ResearchPaper researchPaper) {
        this.researchPaper = researchPaper;
    }

    public void display() {
        researchPaper.view();
    }
    
}
