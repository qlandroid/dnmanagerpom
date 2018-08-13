package org.mybatis.generator;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGeneratorMain {
	public static void main(String[] args) throws IOException, XMLParserException, SQLException, 
	InterruptedException, InvalidConfigurationException {

		List<String> warnings = new ArrayList<>();
		boolean overwrite = true;
		File configFile = new File(MyBatisGenerator.class.getResource("/mybatis/generatorConfig.xml").getFile());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(new ProgressCallback() {
			@Override
			public void introspectionStarted(int totalTasks) {

			}

			@Override
			public void generationStarted(int totalTasks) {

			}

			@Override
			public void saveStarted(int totalTasks) {

			}

			@Override
			public void startTask(String taskName) {

			}

			@Override
			public void done() {
				System.out.println("结束");
			}

			@Override
			public void checkCancel() throws InterruptedException {

			}
		});
		System.out.print("生成完成");
	}

}
