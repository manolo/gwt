/*
 * Copyright 2014 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.i18n.shared.impl.cldr;

// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA
//  cldrVersion=25
//  number=$Revision: 9852 $
//  date=$Date: 2014-02-28 21:57:43 -0800 (Fri, 28 Feb 2014) $
//  type=root

/**
 * Implementation of DateTimeFormatInfo for the "nb" locale.
 */
public class DateTimeFormatInfoImpl_nb extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "a.m.",
        "p.m."
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE d. MMMM y";
  }

  @Override
  public String dateFormatLong() {
    return "d. MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "d. MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "dd.MM.yy";
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " kl. " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "f.Kr.",
        "e.Kr."
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "f.Kr.",
        "e.Kr."
    };
  }

  @Override
  public String formatDay() {
    return "d.";
  }

  @Override
  public String formatHour12Minute() {
    return "h.mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h.mm.ss a";
  }

  @Override
  public String formatHour24Minute() {
    return "HH.mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "HH.mm.ss";
  }

  @Override
  public String formatMinuteSecond() {
    return "mm.ss";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d. MMM";
  }

  @Override
  public String formatMonthFullDay() {
    return "d. MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE d. MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "d.M.";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d. MMM y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d. MMMM y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M.y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d.M.y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE d. MMM y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "januar",
        "februar",
        "mars",
        "april",
        "mai",
        "juni",
        "juli",
        "august",
        "september",
        "oktober",
        "november",
        "desember"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "jan.",
        "feb.",
        "mar.",
        "apr.",
        "mai",
        "jun.",
        "jul.",
        "aug.",
        "sep.",
        "okt.",
        "nov.",
        "des."
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return new String[] {
        "jan",
        "feb",
        "mar",
        "apr",
        "mai",
        "jun",
        "jul",
        "aug",
        "sep",
        "okt",
        "nov",
        "des"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1. kvartal",
        "2. kvartal",
        "3. kvartal",
        "4. kvartal"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "K1",
        "K2",
        "K3",
        "K4"
    };
  }

  @Override
  public String timeFormatFull() {
    return "HH.mm.ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "HH.mm.ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "HH.mm.ss";
  }

  @Override
  public String timeFormatShort() {
    return "HH.mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "søndag",
        "mandag",
        "tirsdag",
        "onsdag",
        "torsdag",
        "fredag",
        "lørdag"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "S",
        "M",
        "T",
        "O",
        "T",
        "F",
        "L"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "søn.",
        "man.",
        "tir.",
        "ons.",
        "tor.",
        "fre.",
        "lør."
    };
  }

  @Override
  public String[] weekdaysShortStandalone() {
    return new String[] {
        "sø.",
        "ma.",
        "ti.",
        "on.",
        "to.",
        "fr.",
        "lø."
    };
  }
}
