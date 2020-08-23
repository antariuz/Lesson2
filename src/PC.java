public class PC {

    private String motherboardModel;
    private String videocardModel;
    private String ramModel;
    private String ssdModel;
    private String powerSupplyModel;
    private String caseModel;

    public static class Builder {
        private PC newPC;

        public Builder() {
            newPC = new PC();
        }

        public Builder withMotherboardModel(String motherboardModel) {
            newPC.motherboardModel = motherboardModel;
            return this;
        }

        public Builder withVideocardModel(String videocardModel) {
            newPC.videocardModel = videocardModel;
            return this;
        }

        public Builder withRamModel(String ramModel) {
            newPC.ramModel = ramModel;
            return this;
        }

        public Builder withSSDModel(String ssdModel) {
            newPC.ssdModel = ssdModel;
            return this;
        }

        public Builder withPowerSupplyModel(String powerSupplyModel) {
            newPC.powerSupplyModel = powerSupplyModel;
            return this;
        }

        public Builder withCaseModel(String caseModel) {
            newPC.caseModel = caseModel;
            return this;
        }

        public PC build() {
            return newPC;
        }

    }

    public static void main(String[] args) {
        PC pc = new PC.Builder()
                .withMotherboardModel("RAMPAGE 8000")
                .withVideocardModel("GEFORCE 5000 RTX")
                .withRamModel("Hynix DDR6 4500 Ghz")
                .withSSDModel("ZALUPKA 1 Tb Russian Edition")
                .withCaseModel("From SHIT and STICKS")
                .build();

        System.out.println("Case " + pc.caseModel + " with " + pc.ssdModel);
    }

}
