/*
 * Copyright 2010-** : Frederick Bloom
 *
 * Licensed under : TBD
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hanaden.springboot.demo.test;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    @BeforeEach
    public void setUpTestMethod() {
    }

    @BeforeAll
    static public void setUpTestRun() {
    }

    @AfterEach
    public void tearDownTestMethod() {
    }

    @AfterAll
    static public void tearDownTestRun() {
    }

    @Test
    public void hello() {
        Calendar calender = Calendar.getInstance();
        Date startTime = calender.getTime();
        startTime.setHours(0); // ----> is depreacted
    }
}
