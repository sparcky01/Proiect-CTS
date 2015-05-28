package FactoryPattern;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestareCuloare.class, TestareNrInmatriculare.class,
		TestareNrLoc.class, TestareNume.class, TestarePret.class })
public class AllTests {

}
