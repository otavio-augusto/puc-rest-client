package restclient.responses;

import com.google.gson.annotations.SerializedName;

public class ExchangeRateResponse {
    @SerializedName("Realtime Currency Exchange Rate")
    public ExchangeRateData exchangeRateData;

    public static class ExchangeRateData {
        @SerializedName("1. From_Currency Code")
        public String fromCurrencyCode;

        @SerializedName("2. From_Currency Name")
        public String fromCurrencyName;

        @SerializedName("3. To_Currency Code")
        public String toCurrencyCode;

        @SerializedName("4. To_Currency Name")
        public String toCurrencyName;

        @SerializedName("5. Exchange Rate")
        public String exchangeRate;

        @SerializedName("6. Last Refreshed")
        public String lastRefreshed;

        @SerializedName("7. Time Zone")
        public String timeZone;

        @SerializedName("8. Bid Price")
        public String bidPrice;

        @SerializedName("9. Ask Price")
        public String askPrice;
    }
}