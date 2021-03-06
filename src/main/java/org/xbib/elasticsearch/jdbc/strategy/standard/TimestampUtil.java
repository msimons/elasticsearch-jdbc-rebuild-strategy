/*
 * Copyright (C) 2015 Jasper Huzen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xbib.elasticsearch.jdbc.strategy.standard;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class TimestampUtil {

    private final static DateTimeFormatter dateTimeFormatter =  DateTimeFormat.forPattern(StrategyConstants.DATE_FORMAT);

    public static String getTimestamp() {
        return dateTimeFormatter.print(DateTimeUtils.currentTimeMillis());
    }

    public static String getTimestamp(DateTime dateTime) {
        return dateTime.toString(dateTimeFormatter);
    }

    public static DateTime getDateTime(String dateTimeString) {
       return dateTimeFormatter.parseDateTime(dateTimeString);
    }



}
