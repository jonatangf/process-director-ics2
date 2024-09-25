package net.portic.processdirector.ics2.prepare;

import lombok.extern.slf4j.Slf4j;
import net.portic.processdirector.common.domain.stages.prepare.Preparer;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ICS2Preparer extends Preparer {

    @Override
    public boolean supports() {
        return true;
    }

    @Override
    public void execute() {
        log.info("Preparing with the ICS2 preparer ...");
    }
}
