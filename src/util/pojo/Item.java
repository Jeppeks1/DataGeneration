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

public class Item {

    public int i_id; // PRIMARY KEY
    public int i_im_id;
    public double i_price;
    public String i_name;
    public String i_data;

    @Override
    public String toString() {
        return ("\n***************** Item ********************"
                + "\n*    i_id = " + i_id + "\n*  i_name = " + i_name
                + "\n* i_price = " + i_price + "\n*  i_data = " + i_data
                + "\n* i_im_id = " + i_im_id + "\n**********************************************");
    }

    public String toHeader(){
        StringBuilder header = new StringBuilder();

        for (Field field : Customer.class.getDeclaredFields()){
            header.append(field.getName()).append(",");
        }

        // Strip the string of the last comma
        return header.toString().substring(0, header.toString().length() - 1);
    }
} // end Item
