/*
 * Copyright 2008-2011 Nokia Siemens Networks Oyj
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

package org.robotframework.swing.table;

import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JTableOperator;
import org.robotframework.swing.chooser.ByNameComponentChooser;
import org.robotframework.swing.context.Context;
import org.robotframework.swing.factory.DefaultContextVerifyingOperatorFactory;

public class TableOperatorFactory extends DefaultContextVerifyingOperatorFactory<TableOperator> {
    public TableOperator createOperatorByIndex(int index) {
        return new TableOperator(new JTableOperator((ContainerOperator) Context.getContext(), index));
    }

    public TableOperator createOperatorByName(String name) {
        return new TableOperator(new JTableOperator((ContainerOperator) Context.getContext(), new ByNameComponentChooser(name)));
    }
}
