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
package com.hanaden.springboot.demo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Main.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);

        Main app = context.getBean(Main.class);
        app.start();
    }

    private void start() {
        Calendar calender = Calendar.getInstance();
        Date startTime = calender.getTime();
        startTime.setHours(0); // ----> is depreacted
        System.out.println("Hello World!");
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
