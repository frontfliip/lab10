package org.example.adapter2;

public class ReportBuilder {
    private DataBase db;
    public ReportBuilder(DataBase db) {
        this.db = db;
    }
    public String getReport() {
        return db.getStatistics();
    }
}
