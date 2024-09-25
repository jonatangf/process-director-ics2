package net.portic.processdirector.ics2.prepare;

import lombok.extern.slf4j.Slf4j;
import net.portic.processdirector.common.domain.model.ExecutionContext;
import net.portic.processdirector.common.domain.service.ConfigurationService;
import net.portic.processdirector.common.domain.service.stages.prepare.Preparer;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ICS2Preparer extends Preparer {

    public ICS2Preparer(ConfigurationService configurationService) {
        super(configurationService);
    }

    @Override
    public ExecutionContext execute(ExecutionContext executionContext) {
        log.info("Preparing with ICS2 preparer ...");
        return executionContext;
    }
}
