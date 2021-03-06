package dsk.codeview.plugin.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import dsk.export.ClassExport;
import dsk.export.tools.SkeletonCodeTools;
import dsk.php_export.core.service.PhpExportService;

public class CodeViewModule extends AbstractModule {
    @Override
    protected void configure() {
        this.bind(ClassExport.class).toInstance(new PhpExportService());
        this.bind(SkeletonCodeTools.class).in(Scopes.SINGLETON);
    }
}
