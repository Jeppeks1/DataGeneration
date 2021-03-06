/******************************************************************************
 *  Copyright 2015 by OLTPBenchmark Project                                   *
 *                                                                            *
 *  Licensed under the Apache License, Version 2.0 (the "License");           *
 *  you may not use this file except in compliance with the License.          *
 *  You may obtain a copy of the License at                                   *
 *                                                                            *
 *    http://www.apache.org/licenses/LICENSE-2.0                              *
 *                                                                            *
 *  Unless required by applicable law or agreed to in writing, software       *
 *  distributed under the License is distributed on an "AS IS" BASIS,         *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 *  See the License for the specific language governing permissions and       *
 *  limitations under the License.                                            *
 ******************************************************************************
 /*
 * Copyright 2017 by INESC TEC
 * This work was based on the OLTPBenchmark Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package util.pojo;

import java.lang.reflect.Field;

public class Warehouse {

    public int w_id; // PRIMARY KEY
    public float w_ytd;
    public double w_tax;
    public String w_name;
    public String w_street_1;
    public String w_street_2;
    public String w_city;
    public String w_state;
    public String w_zip;

    @Override
    public String toString() {
        return ("\n***************** Warehouse ********************"
                + "\n*       w_id = " + w_id + "\n*      w_ytd = " + w_ytd
                + "\n*      w_tax = " + w_tax + "\n*     w_name = " + w_name
                + "\n* w_street_1 = " + w_street_1 + "\n* w_street_2 = "
                + w_street_2 + "\n*     w_city = " + w_city
                + "\n*    w_state = " + w_state + "\n*      w_zip = " + w_zip + "\n**********************************************");
    }

    public String toHeader(){
        StringBuilder header = new StringBuilder();

        for (Field field : Customer.class.getDeclaredFields()){
            header.append(field.getName()).append(",");
        }

        // Strip the string of the last comma
        return header.toString().substring(0, header.toString().length() - 1);
    }

} // end Warehouse