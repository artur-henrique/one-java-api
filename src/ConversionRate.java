import java.math.BigDecimal;
import java.util.Map;

public record ConversionRate(String base_code, Map<String, BigDecimal> conversion_rates) {
}
