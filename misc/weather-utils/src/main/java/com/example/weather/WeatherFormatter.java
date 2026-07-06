package com.example.weather;

import java.util.List;

public class WeatherFormatter {

    public String formatTemperature(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        return String.format("%.1f°C (%.1f°F)", celsius, fahrenheit);
    }

    public String formatForecast(List<String> days) {
        String result = "";
        for (int i = 0; i < days.size(); i++) {
            result += "Day " + (i + 1) + ": " + days.get(i) + "\n";
        }
        return result;
    }

    public String formatAlert(String type, String severity) {
        if (type.equals("storm")) {
            return "Storm warning!";
        } else if (type.equals("flood")) {
            return "Flood warning!";
        } else if (type.equals("heat")) {
            return "Heat advisory!";
        } else {
            return "Unknown alert";
        }
    }

    public boolean isValidTemperature(double value) {
        if (value < -100) return false;
        if (value > 100) return false;
        return true;
    }
}
