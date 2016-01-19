import org.agdula.wintools.psexec.PsExec
import org.agdula.wintools.psexec.PsExecConfig
import spock.lang.Specification

/**
 * @author: Andrzej Gdula
 * @created: 01/19/2016 15:41 
 * @version: 1.0
 */
class PsExecTest extends Specification {

    def "PsExec should extract itself"(){
        given:
        def config = PsExecConfig
                .builder()
                .binaryLocation(System.getProperty("java.io.tmpdir")+"/"+System.currentTimeMillis()+"-PsExec.exe")
                .build()
        when:
            new PsExec(config)
        then:
            new File(config.binaryLocation).exists()
    }
}
