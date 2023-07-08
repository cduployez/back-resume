package fr.cduployez.backresume.core.data.dtos;

import fr.cduployez.backresume.core.data.enums.DateRangeTypeEnum;
import fr.cduployez.backresume.utils.OffsetDateTimeUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.time.Clock;
import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DateRangeDto {

    private OffsetDateTime beginDate;

    /**
     * Optional
     */
    @Nullable
    private OffsetDateTime endDate;

    private DateRangeTypeEnum dateRangeType;

    public static DateRangeDto year(int year, Clock clock) {
        OffsetDateTime date = OffsetDateTimeUtils.fromYear(year, clock);
        return new DateRangeDto(date, date, DateRangeTypeEnum.YEAR);
    }

    public static DateRangeDto yearRange(int beginYear, int endYear, Clock clock) {
        OffsetDateTime beginDate = OffsetDateTimeUtils.fromYear(beginYear, clock);
        OffsetDateTime endDate = OffsetDateTimeUtils.fromYear(endYear, clock);
        return new DateRangeDto(beginDate, endDate, DateRangeTypeEnum.YEAR);
    }

    public static DateRangeDto monthRange(OffsetDateTime beginDate, OffsetDateTime endDate) {
        return new DateRangeDto(beginDate, endDate, DateRangeTypeEnum.MONTH);
    }

}
