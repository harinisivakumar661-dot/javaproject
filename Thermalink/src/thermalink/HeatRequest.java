package thermalink;

public class HeatRequest {

    int industryId;
    double heat;

    HeatRequest(int industryId, double heat) {
        this.industryId = industryId;
        this.heat = heat;
    }
}