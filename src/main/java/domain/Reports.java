package domain;

public class Reports {
    private String reasonForReport;
    private boolean isReported;

    public String getReasonForReport() {
        return reasonForReport;
    }

    public void setReasonForReport(String reasonForReport) {
        this.reasonForReport = reasonForReport;
    }

    public boolean isReported() {
        return isReported;
    }

    public void setReported(boolean reported) {
        isReported = reported;
    }
}
