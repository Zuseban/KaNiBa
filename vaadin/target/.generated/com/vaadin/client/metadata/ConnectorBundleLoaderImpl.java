package com.vaadin.client.metadata;

public class ConnectorBundleLoaderImpl extends com.vaadin.client.metadata.ConnectorBundleLoader {
  public void init() {
    addAsyncBlockLoader(new AsyncBundleLoader("__eager", new String[] {"com.vaadin.server.AbstractJavaScriptExtension","com.vaadin.ui.renderers.ButtonRenderer","com.vaadin.ui.renderers.DateRenderer","com.vaadin.ui.Grid","com.vaadin.ui.renderers.ImageRenderer","com.vaadin.ui.renderers.AbstractJavaScriptRenderer","com.vaadin.ui.renderers.NumberRenderer","com.vaadin.ui.renderers.ProgressBarRenderer","com.vaadin.data.RpcDataProviderExtension","com.vaadin.ui.renderers.TextRenderer","com.vaadin.ui.renderers.HtmlRenderer","com.vaadin.server.BrowserWindowOpener","com.vaadin.server.FileDownloader","com.vaadin.server.Responsive","com.vaadin.ui.JavaScript","com.vaadin.ui.AbstractJavaScriptComponent","com.vaadin.ui.AbsoluteLayout","com.vaadin.ui.Accordion","com.vaadin.ui.Audio","com.vaadin.ui.BrowserFrame","com.vaadin.ui.Button","com.vaadin.ui.CheckBox","com.vaadin.ui.ComboBox","com.vaadin.ui.CssLayout","com.vaadin.ui.CustomComponent","com.vaadin.ui.CustomField","com.vaadin.ui.CustomLayout","com.vaadin.ui.DateField","com.vaadin.ui.InlineDateField","com.vaadin.ui.PopupDateField","com.vaadin.ui.DragAndDropWrapper","com.vaadin.ui.Embedded","com.vaadin.ui.Flash","com.vaadin.ui.Form","com.vaadin.ui.FormLayout","com.vaadin.ui.GridLayout","com.vaadin.ui.Image","com.vaadin.ui.Label","com.vaadin.ui.Link","com.vaadin.ui.ListSelect","com.vaadin.ui.MenuBar","com.vaadin.ui.NativeButton","com.vaadin.ui.NativeSelect","com.vaadin.ui.OptionGroup","com.vaadin.ui.HorizontalLayout","com.vaadin.ui.VerticalLayout","com.vaadin.ui.Panel","com.vaadin.ui.PasswordField","com.vaadin.ui.PopupView","com.vaadin.ui.ProgressBar","com.vaadin.ui.ProgressIndicator","com.vaadin.ui.Slider","com.vaadin.ui.HorizontalSplitPanel","com.vaadin.ui.VerticalSplitPanel","com.vaadin.ui.Table","com.vaadin.ui.TabSheet","com.vaadin.ui.TextArea","com.vaadin.ui.TextField","com.vaadin.ui.Tree","com.vaadin.ui.TreeTable","com.vaadin.ui.TwinColSelect","com.vaadin.ui.UI","com.vaadin.ui.Upload","com.vaadin.ui.Video","com.vaadin.ui.Window","com.vaadin.tapio.googlemaps.GoogleMap","org.vaadin.teemu.ratingstars.RatingStars",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(java.lang.Object.class, null);
            store.setSuperClass(java.util.AbstractMap.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridColumnState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridStaticSectionState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.tapio.googlemaps.client.LatLon.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.MouseEventDetails.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.PageState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.communication.SharedState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.tabsheet.TabState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.LocaleData.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.AbstractComponentState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.JavaScriptExtensionState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractEmbeddedState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractLayoutState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractMediaState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.BrowserWindowOpenerState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(java.util.HashMap.class, java.util.AbstractMap.class);
            store.setSuperClass(com.vaadin.shared.ui.JavaScriptComponentState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.label.LabelState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.link.LinkState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.panel.PanelState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.popupview.PopupViewState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.TabIndexState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.tabsheet.TabsheetState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.AbstractFieldState.class, com.vaadin.shared.ui.TabIndexState.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.accordion.AccordionState.class, com.vaadin.shared.ui.tabsheet.TabsheetState.class);
            store.setSuperClass(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.button.ButtonState.class, com.vaadin.shared.ui.TabIndexState.class);
            store.setSuperClass(com.vaadin.shared.ui.csslayout.CssLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.embedded.EmbeddedState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.flash.FlashState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class);
            store.setSuperClass(com.vaadin.shared.ui.image.ImageState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.menubar.MenuBarState.class, com.vaadin.shared.ui.TabIndexState.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.class, com.vaadin.shared.ui.TabIndexState.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class);
            store.setSuperClass(com.vaadin.shared.ui.video.VideoState.class, com.vaadin.shared.ui.AbstractMediaState.class);
            store.setSuperClass(com.vaadin.shared.ui.window.WindowState.class, com.vaadin.shared.ui.panel.PanelState.class);
            store.setSuperClass(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.checkbox.CheckBoxState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.combobox.ComboBoxState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.form.FormState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.button.NativeButtonState.class, com.vaadin.shared.ui.button.ButtonState.class);
            store.setSuperClass(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.slider.SliderState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.table.TableState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.TextualDateFieldState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.tree.TreeState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, com.vaadin.shared.ui.datefield.TextualDateFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, com.vaadin.shared.ui.datefield.TextualDateFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, com.vaadin.shared.ui.progressindicator.ProgressBarState.class);
            store.setSuperClass(com.vaadin.shared.ui.textarea.TextAreaState.class, com.vaadin.shared.ui.textfield.AbstractTextFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.treetable.TreeTableState.class, com.vaadin.shared.ui.table.TableState.class);
            store.setClass("com.vaadin.server.AbstractJavaScriptExtension", com.vaadin.client.JavaScriptExtension.class);
            store.setClass("com.vaadin.ui.renderers.ButtonRenderer", com.vaadin.client.connectors.ButtonRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.DateRenderer", com.vaadin.client.connectors.DateRendererConnector.class);
            store.setClass("com.vaadin.ui.Grid", com.vaadin.client.connectors.GridConnector.class);
            store.setClass("com.vaadin.ui.renderers.ImageRenderer", com.vaadin.client.connectors.ImageRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.AbstractJavaScriptRenderer", com.vaadin.client.connectors.JavaScriptRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.NumberRenderer", com.vaadin.client.connectors.NumberRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.ProgressBarRenderer", com.vaadin.client.connectors.ProgressBarRendererConnector.class);
            store.setClass("com.vaadin.data.RpcDataProviderExtension", com.vaadin.client.connectors.RpcDataSourceConnector.class);
            store.setClass("com.vaadin.ui.renderers.TextRenderer", com.vaadin.client.connectors.TextRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.HtmlRenderer", com.vaadin.client.connectors.UnsafeHtmlRendererConnector.class);
            store.setClass("com.vaadin.server.BrowserWindowOpener", com.vaadin.client.extensions.BrowserWindowOpenerConnector.class);
            store.setClass("com.vaadin.server.FileDownloader", com.vaadin.client.extensions.FileDownloaderConnector.class);
            store.setClass("com.vaadin.server.Responsive", com.vaadin.client.extensions.ResponsiveConnector.class);
            store.setClass("com.vaadin.ui.JavaScript", com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class);
            store.setClass("com.vaadin.ui.AbstractJavaScriptComponent", com.vaadin.client.ui.JavaScriptComponentConnector.class);
            store.setClass("com.vaadin.ui.AbsoluteLayout", com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class);
            store.setClass("com.vaadin.ui.Accordion", com.vaadin.client.ui.accordion.AccordionConnector.class);
            store.setClass("com.vaadin.ui.Audio", com.vaadin.client.ui.audio.AudioConnector.class);
            store.setClass("com.vaadin.ui.BrowserFrame", com.vaadin.client.ui.browserframe.BrowserFrameConnector.class);
            store.setClass("com.vaadin.ui.Button", com.vaadin.client.ui.button.ButtonConnector.class);
            store.setClass("com.vaadin.ui.CheckBox", com.vaadin.client.ui.checkbox.CheckBoxConnector.class);
            store.setClass("com.vaadin.ui.ComboBox", com.vaadin.client.ui.combobox.ComboBoxConnector.class);
            store.setClass("com.vaadin.ui.CssLayout", com.vaadin.client.ui.csslayout.CssLayoutConnector.class);
            store.setClass("com.vaadin.ui.CustomComponent", com.vaadin.client.ui.customcomponent.CustomComponentConnector.class);
            store.setClass("com.vaadin.ui.CustomField", com.vaadin.client.ui.customfield.CustomFieldConnector.class);
            store.setClass("com.vaadin.ui.CustomLayout", com.vaadin.client.ui.customlayout.CustomLayoutConnector.class);
            store.setClass("com.vaadin.ui.DateField", com.vaadin.client.ui.datefield.DateFieldConnector.class);
            store.setClass("com.vaadin.ui.InlineDateField", com.vaadin.client.ui.datefield.InlineDateFieldConnector.class);
            store.setClass("com.vaadin.ui.PopupDateField", com.vaadin.client.ui.datefield.PopupDateFieldConnector.class);
            store.setClass("com.vaadin.ui.DragAndDropWrapper", com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class);
            store.setClass("com.vaadin.ui.Embedded", com.vaadin.client.ui.embedded.EmbeddedConnector.class);
            store.setClass("com.vaadin.ui.Flash", com.vaadin.client.ui.flash.FlashConnector.class);
            store.setClass("com.vaadin.ui.Form", com.vaadin.client.ui.form.FormConnector.class);
            store.setClass("com.vaadin.ui.FormLayout", com.vaadin.client.ui.formlayout.FormLayoutConnector.class);
            store.setClass("com.vaadin.ui.GridLayout", com.vaadin.client.ui.gridlayout.GridLayoutConnector.class);
            store.setClass("com.vaadin.ui.Image", com.vaadin.client.ui.image.ImageConnector.class);
            store.setClass("com.vaadin.ui.Label", com.vaadin.client.ui.label.LabelConnector.class);
            store.setClass("com.vaadin.ui.Link", com.vaadin.client.ui.link.LinkConnector.class);
            store.setClass("com.vaadin.ui.ListSelect", com.vaadin.client.ui.listselect.ListSelectConnector.class);
            store.setClass("com.vaadin.ui.MenuBar", com.vaadin.client.ui.menubar.MenuBarConnector.class);
            store.setClass("com.vaadin.ui.NativeButton", com.vaadin.client.ui.nativebutton.NativeButtonConnector.class);
            store.setClass("com.vaadin.ui.NativeSelect", com.vaadin.client.ui.nativeselect.NativeSelectConnector.class);
            store.setClass("com.vaadin.ui.OptionGroup", com.vaadin.client.ui.optiongroup.OptionGroupConnector.class);
            store.setClass("com.vaadin.ui.HorizontalLayout", com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class);
            store.setClass("com.vaadin.ui.VerticalLayout", com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class);
            store.setClass("com.vaadin.ui.Panel", com.vaadin.client.ui.panel.PanelConnector.class);
            store.setClass("com.vaadin.ui.PasswordField", com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class);
            store.setClass("com.vaadin.ui.PopupView", com.vaadin.client.ui.popupview.PopupViewConnector.class);
            store.setClass("com.vaadin.ui.ProgressBar", com.vaadin.client.ui.progressindicator.ProgressBarConnector.class);
            store.setClass("com.vaadin.ui.ProgressIndicator", com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class);
            store.setClass("com.vaadin.ui.Slider", com.vaadin.client.ui.slider.SliderConnector.class);
            store.setClass("com.vaadin.ui.HorizontalSplitPanel", com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class);
            store.setClass("com.vaadin.ui.VerticalSplitPanel", com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class);
            store.setClass("com.vaadin.ui.Table", com.vaadin.client.ui.table.TableConnector.class);
            store.setClass("com.vaadin.ui.TabSheet", com.vaadin.client.ui.tabsheet.TabsheetConnector.class);
            store.setClass("com.vaadin.ui.TextArea", com.vaadin.client.ui.textarea.TextAreaConnector.class);
            store.setClass("com.vaadin.ui.TextField", com.vaadin.client.ui.textfield.TextFieldConnector.class);
            store.setClass("com.vaadin.ui.Tree", com.vaadin.client.ui.tree.TreeConnector.class);
            store.setClass("com.vaadin.ui.TreeTable", com.vaadin.client.ui.treetable.TreeTableConnector.class);
            store.setClass("com.vaadin.ui.TwinColSelect", com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class);
            store.setClass("com.vaadin.ui.UI", com.vaadin.client.ui.ui.UIConnector.class);
            store.setClass("com.vaadin.ui.Upload", com.vaadin.client.ui.upload.UploadConnector.class);
            store.setClass("com.vaadin.ui.Video", com.vaadin.client.ui.video.VideoConnector.class);
            store.setClass("com.vaadin.ui.Window", com.vaadin.client.ui.window.WindowConnector.class);
            store.setClass("com.vaadin.tapio.googlemaps.GoogleMap", com.vaadin.tapio.googlemaps.client.GoogleMapConnector.class);
            store.setClass("org.vaadin.teemu.ratingstars.RatingStars", org.vaadin.teemu.ratingstars.gwt.client.RatingStarsConnector.class);
            store.setConstructor(com.vaadin.client.JavaScriptExtension.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.JavaScriptExtension.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.ButtonRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.ButtonRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.DateRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.DateRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.GridConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.GridConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.ImageRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.ImageRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.JavaScriptRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.JavaScriptRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.NumberRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.NumberRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.ProgressBarRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.ProgressBarRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.RpcDataSourceConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.RpcDataSourceConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.TextRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.TextRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.UnsafeHtmlRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.UnsafeHtmlRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.FileDownloaderConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.FileDownloaderConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.ResponsiveConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.ResponsiveConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.ButtonRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.ButtonRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.ImageRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.ImageRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.ProgressBarRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.ProgressBarRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.TextRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.TextRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.JavaScriptComponentConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.JavaScriptComponentConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.JavaScriptWidget.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.JavaScriptWidget.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VAbsoluteLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VAbsoluteLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VAccordion.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VAccordion.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VBrowserFrame.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VBrowserFrame.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VButton.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCheckBox.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCheckBox.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCssLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCssLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCustomComponent.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCustomComponent.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCustomLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCustomLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VDateFieldCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VDateFieldCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VDragAndDropWrapper.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VDragAndDropWrapper.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VEmbedded.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VEmbedded.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFilterSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFilterSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFlash.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFlash.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VForm.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VForm.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFormLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFormLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VGridLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VGridLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VHorizontalLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VHorizontalLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VImage.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VImage.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VLabel.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VLabel.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VLink.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VLink.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VListSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VListSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VMenuBar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VMenuBar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VNativeButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VNativeButton.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VNativeSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VNativeSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VOptionGroup.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VOptionGroup.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPanel.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPanel.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPasswordField.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPasswordField.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPopupCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPopupCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPopupView.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPopupView.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VProgressBar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VProgressBar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VProgressIndicator.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VProgressIndicator.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VScrollTable.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VScrollTable.class);
              }
            });
            load0();
          }
          private void load0() {
            store.setConstructor(com.vaadin.client.ui.VSlider.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSlider.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VSplitPanelHorizontal.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSplitPanelHorizontal.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VSplitPanelVertical.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSplitPanelVertical.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTabsheet.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTabsheet.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTextArea.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTextArea.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTextField.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTextField.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTree.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTree.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTreeTable.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTreeTable.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTwinColSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTwinColSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUI.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUI.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUnknownComponent.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUnknownComponent.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUpload.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUpload.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VVerticalLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VVerticalLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VVideo.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VVideo.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VWindow.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VWindow.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.accordion.AccordionConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.accordion.AccordionConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.audio.AudioConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.audio.AudioConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.button.ButtonConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.button.ButtonConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.checkbox.CheckBoxConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.combobox.ComboBoxConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.combobox.ComboBoxConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.csslayout.CssLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customfield.CustomFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customfield.CustomFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.DateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.DateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.embedded.EmbeddedConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.embedded.EmbeddedConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.flash.FlashConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.flash.FlashConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.form.FormConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.form.FormConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.formlayout.FormLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.image.ImageConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.image.ImageConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.label.LabelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.label.LabelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.link.LinkConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.link.LinkConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.listselect.ListSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.listselect.ListSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.menubar.MenuBarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.menubar.MenuBarConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.panel.PanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.panel.PanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.popupview.PopupViewConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.popupview.PopupViewConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.progressindicator.ProgressBarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.progressindicator.ProgressBarConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.slider.SliderConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.slider.SliderConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.table.TableConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.table.TableConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.tabsheet.TabsheetConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.textarea.TextAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.textarea.TextAreaConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.textfield.TextFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.textfield.TextFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.tree.TreeConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.tree.TreeConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.treetable.TreeTableConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.treetable.TreeTableConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.ui.UIConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.ui.UIConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.upload.UploadConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.upload.UploadConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.video.VideoConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.video.VideoConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.window.WindowConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.window.WindowConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.widgets.Grid.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.widgets.Grid.class);
              }
            });
            store.setConstructor(com.vaadin.shared.AbstractComponentState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.AbstractComponentState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.AbstractFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.AbstractFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.JavaScriptExtensionState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.JavaScriptExtensionState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.MouseEventDetails.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.MouseEventDetails.class);
              }
            });
            store.setConstructor(com.vaadin.shared.communication.SharedState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.communication.SharedState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.AbstractMediaState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.AbstractMediaState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.BrowserWindowOpenerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.BrowserWindowOpenerState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.JavaScriptComponentState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.JavaScriptComponentState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.accordion.AccordionState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.accordion.AccordionState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.browserframe.BrowserFrameState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.button.ButtonState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.button.ButtonState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.button.NativeButtonState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.button.NativeButtonState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.checkbox.CheckBoxState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.checkbox.CheckBoxState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.combobox.ComboBoxState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.combobox.ComboBoxState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.csslayout.CssLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.csslayout.CssLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.customlayout.CustomLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.datefield.InlineDateFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.datefield.PopupDateFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.embedded.EmbeddedState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.embedded.EmbeddedState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.flash.FlashState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.flash.FlashState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.form.FormState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.form.FormState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridColumnState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridColumnState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridStaticSectionState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridStaticSectionState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.gridlayout.GridLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.image.ImageState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.image.ImageState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.label.LabelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.label.LabelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.link.LinkState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.link.LinkState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.menubar.MenuBarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.menubar.MenuBarState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.optiongroup.OptionGroupState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.panel.PanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.panel.PanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.popupview.PopupViewState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.popupview.PopupViewState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.progressindicator.ProgressBarState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.slider.SliderState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.slider.SliderState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.table.TableState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.table.TableState.class);
              }
            });
            load1();
          }
          private void load1() {
            store.setConstructor(com.vaadin.shared.ui.tabsheet.TabState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tabsheet.TabState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tabsheet.TabsheetState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tabsheet.TabsheetState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.textarea.TextAreaState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.textarea.TextAreaState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tree.TreeState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tree.TreeState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.treetable.TreeTableState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.treetable.TreeTableState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.PageState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.PageState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.LocaleData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.LocaleData.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.video.VideoState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.video.VideoState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.window.WindowState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.window.WindowState.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.GoogleMapConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.GoogleMapConnector.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.GoogleMapState.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.LatLon.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.LatLon.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class);
              }
            });
            store.setConstructor(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class);
              }
            });
            store.setConstructor(java.util.HashMap.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(java.util.HashMap.class);
              }
            });
            store.setConstructor(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsConnector.class);
              }
            });
            store.setConstructor(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class);
              }
            });
            store.setReturnType(com.vaadin.client.JavaScriptExtension.class, "getState", new Type(com.vaadin.shared.JavaScriptExtensionState.class));
            store.setReturnType(com.vaadin.client.connectors.ButtonRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.ButtonRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.ButtonRendererConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.DateRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.DateRendererConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.GridConnector.class, "getWidget", new Type("com.vaadin.client.widgets.Grid", new Type[] {new Type(elemental.json.JsonObject.class), }));
            store.setReturnType(com.vaadin.client.connectors.GridConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.GridState.class));
            store.setReturnType(com.vaadin.client.connectors.ImageRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.ImageRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.ImageRendererConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.JavaScriptRendererConnector.class, "getState", new Type(com.vaadin.shared.JavaScriptExtensionState.class));
            store.setReturnType(com.vaadin.client.connectors.NumberRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.NumberRendererConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.ProgressBarRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.ProgressBarRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.ProgressBarRendererConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.RpcDataSourceConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.TextRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.TextRendererConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.class, "getRenderer", new Type(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.UnsafeHtmlRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class, "getState", new Type(com.vaadin.shared.ui.BrowserWindowOpenerState.class));
            store.setReturnType(com.vaadin.client.extensions.FileDownloaderConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.extensions.ResponsiveConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class, "getState", new Type(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class));
            store.setReturnType(com.vaadin.client.ui.JavaScriptComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.JavaScriptWidget.class));
            store.setReturnType(com.vaadin.client.ui.JavaScriptComponentConnector.class, "getState", new Type(com.vaadin.shared.ui.JavaScriptComponentState.class));
            store.setReturnType(com.vaadin.client.ui.UnknownComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUnknownComponent.class));
            store.setReturnType(com.vaadin.client.ui.UnknownComponentConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VAbsoluteLayout.class));
            store.setReturnType(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.accordion.AccordionConnector.class, "getWidget", new Type(com.vaadin.client.ui.VAccordion.class));
            store.setReturnType(com.vaadin.client.ui.accordion.AccordionConnector.class, "getState", new Type(com.vaadin.shared.ui.accordion.AccordionState.class));
            store.setReturnType(com.vaadin.client.ui.audio.AudioConnector.class, "getState", new Type(com.vaadin.shared.ui.AbstractMediaState.class));
            store.setReturnType(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, "getWidget", new Type(com.vaadin.client.ui.VBrowserFrame.class));
            store.setReturnType(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, "getState", new Type(com.vaadin.shared.ui.browserframe.BrowserFrameState.class));
            store.setReturnType(com.vaadin.client.ui.button.ButtonConnector.class, "getWidget", new Type(com.vaadin.client.ui.VButton.class));
            store.setReturnType(com.vaadin.client.ui.button.ButtonConnector.class, "getState", new Type(com.vaadin.shared.ui.button.ButtonState.class));
            store.setReturnType(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCheckBox.class));
            store.setReturnType(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, "getState", new Type(com.vaadin.shared.ui.checkbox.CheckBoxState.class));
            store.setReturnType(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFilterSelect.class));
            store.setReturnType(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "getState", new Type(com.vaadin.shared.ui.combobox.ComboBoxState.class));
            store.setReturnType(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCssLayout.class));
            store.setReturnType(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.csslayout.CssLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomComponent.class));
            store.setReturnType(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.customfield.CustomFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomComponent.class));
            store.setReturnType(com.vaadin.client.ui.customfield.CustomFieldConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            store.setReturnType(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomLayout.class));
            store.setReturnType(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.customlayout.CustomLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.DateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.DateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.PopupDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VDateFieldCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.InlineDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.PopupDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, "getWidget", new Type(com.vaadin.client.ui.VDragAndDropWrapper.class));
            store.setReturnType(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.embedded.EmbeddedConnector.class, "getWidget", new Type(com.vaadin.client.ui.VEmbedded.class));
            store.setReturnType(com.vaadin.client.ui.embedded.EmbeddedConnector.class, "getState", new Type(com.vaadin.shared.ui.embedded.EmbeddedState.class));
            store.setReturnType(com.vaadin.client.ui.flash.FlashConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFlash.class));
            store.setReturnType(com.vaadin.client.ui.flash.FlashConnector.class, "getState", new Type(com.vaadin.shared.ui.flash.FlashState.class));
            store.setReturnType(com.vaadin.client.ui.form.FormConnector.class, "getWidget", new Type(com.vaadin.client.ui.VForm.class));
            store.setReturnType(com.vaadin.client.ui.form.FormConnector.class, "getState", new Type(com.vaadin.shared.ui.form.FormState.class));
            store.setReturnType(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFormLayout.class));
            store.setReturnType(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VGridLayout.class));
            store.setReturnType(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.gridlayout.GridLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.image.ImageConnector.class, "getWidget", new Type(com.vaadin.client.ui.VImage.class));
            store.setReturnType(com.vaadin.client.ui.image.ImageConnector.class, "getState", new Type(com.vaadin.shared.ui.image.ImageState.class));
            store.setReturnType(com.vaadin.client.ui.label.LabelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VLabel.class));
            store.setReturnType(com.vaadin.client.ui.label.LabelConnector.class, "getState", new Type(com.vaadin.shared.ui.label.LabelState.class));
            store.setReturnType(com.vaadin.client.ui.link.LinkConnector.class, "getWidget", new Type(com.vaadin.client.ui.VLink.class));
            store.setReturnType(com.vaadin.client.ui.link.LinkConnector.class, "getState", new Type(com.vaadin.shared.ui.link.LinkState.class));
            store.setReturnType(com.vaadin.client.ui.listselect.ListSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VListSelect.class));
            store.setReturnType(com.vaadin.client.ui.listselect.ListSelectConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            store.setReturnType(com.vaadin.client.ui.menubar.MenuBarConnector.class, "getWidget", new Type(com.vaadin.client.ui.VMenuBar.class));
            store.setReturnType(com.vaadin.client.ui.menubar.MenuBarConnector.class, "getState", new Type(com.vaadin.shared.ui.menubar.MenuBarState.class));
            store.setReturnType(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, "getWidget", new Type(com.vaadin.client.ui.VNativeButton.class));
            store.setReturnType(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, "getState", new Type(com.vaadin.shared.ui.button.NativeButtonState.class));
            store.setReturnType(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VNativeSelect.class));
            store.setReturnType(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class, "getWidget", new Type(com.vaadin.client.ui.VOptionGroup.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class, "getState", new Type(com.vaadin.shared.ui.optiongroup.OptionGroupState.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VHorizontalLayout.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VVerticalLayout.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.panel.PanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPanel.class));
            store.setReturnType(com.vaadin.client.ui.panel.PanelConnector.class, "getState", new Type(com.vaadin.shared.ui.panel.PanelState.class));
            store.setReturnType(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPasswordField.class));
            store.setReturnType(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class));
            store.setReturnType(com.vaadin.client.ui.popupview.PopupViewConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupView.class));
            store.setReturnType(com.vaadin.client.ui.popupview.PopupViewConnector.class, "getState", new Type(com.vaadin.shared.ui.popupview.PopupViewState.class));
            store.setReturnType(com.vaadin.client.ui.progressindicator.ProgressBarConnector.class, "getWidget", new Type(com.vaadin.client.ui.VProgressBar.class));
            store.setReturnType(com.vaadin.client.ui.progressindicator.ProgressBarConnector.class, "getState", new Type(com.vaadin.shared.ui.progressindicator.ProgressBarState.class));
            store.setReturnType(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class, "getWidget", new Type(com.vaadin.client.ui.VProgressIndicator.class));
            store.setReturnType(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class, "getState", new Type(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class));
            store.setReturnType(com.vaadin.client.ui.slider.SliderConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSlider.class));
            store.setReturnType(com.vaadin.client.ui.slider.SliderConnector.class, "getState", new Type(com.vaadin.shared.ui.slider.SliderState.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSplitPanelHorizontal.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, "getState", new Type(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSplitPanelVertical.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, "getState", new Type(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class));
            store.setReturnType(com.vaadin.client.ui.table.TableConnector.class, "getWidget", new Type(com.vaadin.client.ui.VScrollTable.class));
            store.setReturnType(com.vaadin.client.ui.table.TableConnector.class, "getState", new Type(com.vaadin.shared.ui.table.TableState.class));
            store.setReturnType(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTabsheet.class));
            store.setReturnType(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, "getState", new Type(com.vaadin.shared.ui.tabsheet.TabsheetState.class));
            store.setReturnType(com.vaadin.client.ui.textarea.TextAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTextArea.class));
            store.setReturnType(com.vaadin.client.ui.textarea.TextAreaConnector.class, "getState", new Type(com.vaadin.shared.ui.textarea.TextAreaState.class));
            store.setReturnType(com.vaadin.client.ui.textfield.TextFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTextField.class));
            store.setReturnType(com.vaadin.client.ui.textfield.TextFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class));
            store.setReturnType(com.vaadin.client.ui.tree.TreeConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTree.class));
            store.setReturnType(com.vaadin.client.ui.tree.TreeConnector.class, "getState", new Type(com.vaadin.shared.ui.tree.TreeState.class));
            store.setReturnType(com.vaadin.client.ui.treetable.TreeTableConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTreeTable.class));
            store.setReturnType(com.vaadin.client.ui.treetable.TreeTableConnector.class, "getState", new Type(com.vaadin.shared.ui.treetable.TreeTableState.class));
            store.setReturnType(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTwinColSelect.class));
            store.setReturnType(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "getState", new Type(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class));
            store.setReturnType(com.vaadin.client.ui.ui.UIConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUI.class));
            store.setReturnType(com.vaadin.client.ui.ui.UIConnector.class, "getState", new Type(com.vaadin.shared.ui.ui.UIState.class));
            store.setReturnType(com.vaadin.client.ui.upload.UploadConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUpload.class));
            store.setReturnType(com.vaadin.client.ui.upload.UploadConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.video.VideoConnector.class, "getWidget", new Type(com.vaadin.client.ui.VVideo.class));
            store.setReturnType(com.vaadin.client.ui.video.VideoConnector.class, "getState", new Type(com.vaadin.shared.ui.video.VideoState.class));
            store.setReturnType(com.vaadin.client.ui.window.WindowConnector.class, "getWidget", new Type(com.vaadin.client.ui.VWindow.class));
            store.setReturnType(com.vaadin.client.ui.window.WindowConnector.class, "getState", new Type(com.vaadin.shared.ui.window.WindowState.class));
            store.setReturnType(com.vaadin.tapio.googlemaps.client.GoogleMapConnector.class, "getState", new Type(com.vaadin.tapio.googlemaps.client.GoogleMapState.class));
            store.setReturnType(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsConnector.class, "getState", new Type(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class));
            store.setReturnType(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsConnector.class, "getWidget", new Type(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsWidget.class));
            store.setInvoker(com.vaadin.client.connectors.GridConnector.class, "onCellStyleGeneratorChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.GridConnector::onCellStyleGeneratorChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.GridConnector.class, "onRowStyleGeneratorChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.GridConnector::onRowStyleGeneratorChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.VAccordion.class, "setTabCaptionsAsHtml",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VAccordion) target).setTabCaptionsAsHtml((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTabsheet.class, "setTabCaptionsAsHtml",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTabsheet) target).setTabCaptionsAsHtml((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setRows((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setWordwrap",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setWordwrap((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "onResourceChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::onResourceChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "setCaption",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::setCaption(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "setClickShortcut",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::setClickShortcut(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "setErrorMessage",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::setErrorMessage(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "setIconAltText",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::setIconAltText(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "onServerEventListenerChanged",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.nativeselect.NativeSelectConnector::onServerEventListenerChanged(*)();
                return null;
              }-*/;
            });
            load2();
          }
          private void load2() {
            store.setInvoker(com.vaadin.client.ui.ui.UIConnector.class, "onThemeChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.ui.UIConnector::onThemeChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setColumnReorderingAllowed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setColumnReorderingAllowed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setEditorCancelCaption",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setEditorCancelCaption((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setEditorSaveCaption",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setEditorSaveCaption((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setHeightByRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setHeightByRows((java.lang.Double) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setHeightMode",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setHeightMode((com.vaadin.shared.ui.grid.HeightMode) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "insertRowData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).insertRowData((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "removeRowData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).removeRowData((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "resetDataAndSize",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).resetDataAndSize((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "setRowData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).setRowData((java.lang.Integer) params[0], com.vaadin.client.communication.JsonDecoder.<elemental.json.JsonArray>obj2jso(params[1]));
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc.class, "executeJavaScript",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc) target).executeJavaScript((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.MediaControl.class, "pause",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.MediaControl) target).pause();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.MediaControl.class, "play",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.MediaControl) target).play();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.calendar.CalendarClientRpc.class, "scroll",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.calendar.CalendarClientRpc) target).scroll((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.EditorClientRpc.class, "bind",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.EditorClientRpc) target).bind((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.EditorClientRpc.class, "cancel",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.EditorClientRpc) target).cancel((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.EditorClientRpc.class, "confirmBind",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.EditorClientRpc) target).confirmBind((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.EditorClientRpc.class, "confirmSave",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.EditorClientRpc) target).confirmSave((java.lang.Boolean) params[0], (java.lang.String) params[1], (java.util.List) params[2]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "recalculateColumnWidths",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).recalculateColumnWidths();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToEnd",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).scrollToEnd();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToRow",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).scrollToRow((java.lang.Integer) params[0], (com.vaadin.shared.ui.grid.ScrollDestination) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToStart",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).scrollToStart();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "setSelectAll",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).setSelectAll((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.tabsheet.TabsheetClientRpc.class, "revertToSharedStateSelection",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetClientRpc) target).revertToSharedStateSelection();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.DebugWindowClientRpc.class, "reportLayoutProblems",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.DebugWindowClientRpc) target).reportLayoutProblems((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.PageClientRpc.class, "reload",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.PageClientRpc) target).reload();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.ScrollClientRpc) target).setScrollLeft((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.ScrollClientRpc) target).setScrollTop((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.UIClientRpc.class, "uiClosed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIClientRpc) target).uiClosed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.upload.UploadClientRpc.class, "submitUpload",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.upload.UploadClientRpc) target).submitUpload();
                return null;
              }
            });
            store.setInvoker(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsWidget.class, "setAnimationEnabled",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((org.vaadin.teemu.ratingstars.gwt.client.RatingStarsWidget) target).setAnimationEnabled((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsWidget.class, "setMaxValue",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((org.vaadin.teemu.ratingstars.gwt.client.RatingStarsWidget) target).setMaxValue((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsWidget.class, "setValue",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((org.vaadin.teemu.ratingstars.gwt.client.RatingStarsWidget) target).setValue((java.lang.Double) params[0]);
                return null;
              }
            });
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class, "blur", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, "blur", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, "focus", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class, "focus", new Type[] {});
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "insertRowData", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "removeRowData", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "resetDataAndSize", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "setRowData", new Type[] {new Type(java.lang.Integer.class), new Type(elemental.json.JsonArray.class), });
            store.setParamTypes(com.vaadin.shared.data.DataRequestRpc.class, "requestRows", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataRequestRpc.class, "setPinned", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc.class, "executeJavaScript", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.ClickRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.LayoutClickRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.MediaControl.class, "pause", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.MediaControl.class, "play", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.button.ButtonServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.button.ButtonServerRpc.class, "disableOnClick", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarClientRpc.class, "scroll", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "actionOnEmptyCell", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "actionOnEvent", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "backward", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "dateClick", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "eventClick", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "eventMove", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "eventResize", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.String.class), new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "forward", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "rangeSelect", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "scroll", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "weekClick", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, "setChecked", new Type[] {new Type(java.lang.Boolean.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class, "select", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, "refresh", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, "select", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class, "openPopup", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.EditorClientRpc.class, "bind", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.EditorClientRpc.class, "cancel", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.EditorClientRpc.class, "confirmBind", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.EditorClientRpc.class, "confirmSave", new Type[] {new Type(java.lang.Boolean.class), new Type(java.lang.String.class), new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.grid.EditorServerRpc.class, "bind", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.EditorServerRpc.class, "cancel", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.EditorServerRpc.class, "save", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "recalculateColumnWidths", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToEnd", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToRow", new Type[] {new Type(java.lang.Integer.class), new Type(com.vaadin.shared.ui.grid.ScrollDestination.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToStart", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "setSelectAll", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "columnVisibilityChanged", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Boolean.class), new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "columnsReordered", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "itemClick", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "select", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "selectAll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "sort", new Type[] {new Type(java.lang.String[].class), new Type(com.vaadin.shared.data.sort.SortDirection[].class), new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.renderers.RendererClickRpc.class, "click", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.image.ImageServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.panel.PanelServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class, "setPopupVisibility", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.slider.SliderServerRpc.class, "valueChanged", new Type[] {new Type(java.lang.Double.class), });
            store.setParamTypes(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, "setSplitterPosition", new Type[] {new Type(java.lang.Float.class), });
            store.setParamTypes(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, "splitterClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.tabsheet.TabsheetClientRpc.class, "revertToSharedStateSelection", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class, "closeTab", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class, "setSelected", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowClientRpc.class, "reportLayoutProblems", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, "analyzeLayouts", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, "showServerDebugInfo", new Type[] {new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, "showServerDesign", new Type[] {new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.PageClientRpc.class, "reload", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIClientRpc.class, "uiClosed", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.upload.UploadClientRpc.class, "submitUpload", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.upload.UploadServerRpc.class, "change", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.window.WindowServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.window.WindowServerRpc.class, "windowModeChanged", new Type[] {new Type(com.vaadin.shared.ui.window.WindowMode.class), });
            store.setParamTypes(com.vaadin.shared.ui.window.WindowServerRpc.class, "windowMoved", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.tapio.googlemaps.client.rpcs.InfoWindowClosedRpc.class, "infoWindowClosed", new Type[] {new Type(java.lang.Long.class), });
            store.setParamTypes(com.vaadin.tapio.googlemaps.client.rpcs.MapClickedRpc.class, "mapClicked", new Type[] {new Type(com.vaadin.tapio.googlemaps.client.LatLon.class), });
            store.setParamTypes(com.vaadin.tapio.googlemaps.client.rpcs.MapMovedRpc.class, "mapMoved", new Type[] {new Type(java.lang.Integer.class), new Type(com.vaadin.tapio.googlemaps.client.LatLon.class), new Type(com.vaadin.tapio.googlemaps.client.LatLon.class), new Type(com.vaadin.tapio.googlemaps.client.LatLon.class), });
            store.setParamTypes(com.vaadin.tapio.googlemaps.client.rpcs.MapTypeChangedRpc.class, "mapTypeChanged", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.tapio.googlemaps.client.rpcs.MarkerClickedRpc.class, "markerClicked", new Type[] {new Type(java.lang.Long.class), });
            store.setParamTypes(com.vaadin.tapio.googlemaps.client.rpcs.MarkerDraggedRpc.class, "markerDragged", new Type[] {new Type(java.lang.Long.class), new Type(com.vaadin.tapio.googlemaps.client.LatLon.class), });
            store.setParamTypes(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsServerRpc.class, "valueChanged", new Type[] {new Type(java.lang.Double.class), });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.BlurServerRpc() {
                  public void blur() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class).getMethod("blur"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc() {
                  public void blur() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class).getMethod("blur"), new Object [] {});
                  }
                  public void focus() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class).getMethod("focus"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.FocusServerRpc() {
                  public void focus() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class).getMethod("focus"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.data.DataRequestRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.data.DataRequestRpc() {
                  public void requestRows(int p0, int p1, int p2, int p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.DataRequestRpc.class).getMethod("requestRows"), new Object [] {p0, p1, p2, p3, });
                  }
                  public void setPinned(java.lang.String p0, boolean p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.DataRequestRpc.class).getMethod("setPinned"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.ClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ClickRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ClickRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.LayoutClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.LayoutClickRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.LayoutClickRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.button.ButtonServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.button.ButtonServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.button.ButtonServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void disableOnClick() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.button.ButtonServerRpc.class).getMethod("disableOnClick"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.calendar.CalendarServerRpc() {
                  public void actionOnEmptyCell(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("actionOnEmptyCell"), new Object [] {p0, p1, p2, });
                  }
                  public void actionOnEvent(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("actionOnEvent"), new Object [] {p0, p1, p2, p3, });
                  }
                  public void backward() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("backward"), new Object [] {});
                  }
                  public void dateClick(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("dateClick"), new Object [] {p0, });
                  }
                  public void eventClick(int p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("eventClick"), new Object [] {p0, });
                  }
                  public void eventMove(int p0, java.lang.String p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("eventMove"), new Object [] {p0, p1, });
                  }
                  public void eventResize(int p0, java.lang.String p1, java.lang.String p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("eventResize"), new Object [] {p0, p1, p2, });
                  }
                  public void forward() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("forward"), new Object [] {});
                  }
                  public void rangeSelect(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("rangeSelect"), new Object [] {p0, });
                  }
                  public void scroll(int p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("scroll"), new Object [] {p0, });
                  }
                  public void weekClick(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.calendar.CalendarServerRpc.class).getMethod("weekClick"), new Object [] {p0, });
                  }
                };
              }
            });
            load3();
          }
          private void load3() {
            store.setProxyHandler(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.checkbox.CheckBoxServerRpc() {
                  public void setChecked(boolean p0, com.vaadin.shared.MouseEventDetails p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class).getMethod("setChecked"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc() {
                  public void select(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class).getMethod("select"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc() {
                  public void refresh() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class).getMethod("refresh"), new Object [] {});
                  }
                  public void select(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class).getMethod("select"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc() {
                  public void openPopup(boolean p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class).getMethod("openPopup"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.csslayout.CssLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.embedded.EmbeddedServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.EditorServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.EditorServerRpc() {
                  public void bind(int p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.EditorServerRpc.class).getMethod("bind"), new Object [] {p0, });
                  }
                  public void cancel(int p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.EditorServerRpc.class).getMethod("cancel"), new Object [] {p0, });
                  }
                  public void save(int p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.EditorServerRpc.class).getMethod("save"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.GridServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.GridServerRpc() {
                  public void columnVisibilityChanged(java.lang.String p0, boolean p1, boolean p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("columnVisibilityChanged"), new Object [] {p0, p1, p2, });
                  }
                  public void columnsReordered(java.util.List p0, java.util.List p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("columnsReordered"), new Object [] {p0, p1, });
                  }
                  public void itemClick(java.lang.String p0, java.lang.String p1, com.vaadin.shared.MouseEventDetails p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("itemClick"), new Object [] {p0, p1, p2, });
                  }
                  public void select(java.util.List p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("select"), new Object [] {p0, });
                  }
                  public void selectAll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("selectAll"), new Object [] {});
                  }
                  public void sort(java.lang.String[] p0, com.vaadin.shared.data.sort.SortDirection[] p1, boolean p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("sort"), new Object [] {p0, p1, p2, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.renderers.RendererClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.renderers.RendererClickRpc() {
                  public void click(java.lang.String p0, java.lang.String p1, com.vaadin.shared.MouseEventDetails p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.renderers.RendererClickRpc.class).getMethod("click"), new Object [] {p0, p1, p2, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.image.ImageServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.image.ImageServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.image.ImageServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.panel.PanelServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.panel.PanelServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.panel.PanelServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.popupview.PopupViewServerRpc() {
                  public void setPopupVisibility(boolean p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class).getMethod("setPopupVisibility"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc() {
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class).getMethod("poll"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.slider.SliderServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.slider.SliderServerRpc() {
                  public void valueChanged(double p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.slider.SliderServerRpc.class).getMethod("valueChanged"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc() {
                  public void setSplitterPosition(float p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class).getMethod("setSplitterPosition"), new Object [] {p0, });
                  }
                  public void splitterClick(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class).getMethod("splitterClick"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.tabsheet.TabsheetServerRpc() {
                  public void closeTab(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class).getMethod("closeTab"), new Object [] {p0, });
                  }
                  public void setSelected(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class).getMethod("setSelected"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ui.DebugWindowServerRpc() {
                  public void analyzeLayouts() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class).getMethod("analyzeLayouts"), new Object [] {});
                  }
                  public void showServerDebugInfo(com.vaadin.shared.Connector p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class).getMethod("showServerDebugInfo"), new Object [] {p0, });
                  }
                  public void showServerDesign(com.vaadin.shared.Connector p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class).getMethod("showServerDesign"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.ui.UIServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ui.UIServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("poll"), new Object [] {});
                  }
                  public void resize(int p0, int p1, int p2, int p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("resize"), new Object [] {p0, p1, p2, p3, });
                  }
                  public void scroll(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("scroll"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.upload.UploadServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.upload.UploadServerRpc() {
                  public void change(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.upload.UploadServerRpc.class).getMethod("change"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.window.WindowServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.window.WindowServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.window.WindowServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void windowModeChanged(com.vaadin.shared.ui.window.WindowMode p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.window.WindowServerRpc.class).getMethod("windowModeChanged"), new Object [] {p0, });
                  }
                  public void windowMoved(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.window.WindowServerRpc.class).getMethod("windowMoved"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.tapio.googlemaps.client.rpcs.InfoWindowClosedRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.tapio.googlemaps.client.rpcs.InfoWindowClosedRpc() {
                  public void infoWindowClosed(long p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.tapio.googlemaps.client.rpcs.InfoWindowClosedRpc.class).getMethod("infoWindowClosed"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.tapio.googlemaps.client.rpcs.MapClickedRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.tapio.googlemaps.client.rpcs.MapClickedRpc() {
                  public void mapClicked(com.vaadin.tapio.googlemaps.client.LatLon p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.tapio.googlemaps.client.rpcs.MapClickedRpc.class).getMethod("mapClicked"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.tapio.googlemaps.client.rpcs.MapMovedRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.tapio.googlemaps.client.rpcs.MapMovedRpc() {
                  public void mapMoved(int p0, com.vaadin.tapio.googlemaps.client.LatLon p1, com.vaadin.tapio.googlemaps.client.LatLon p2, com.vaadin.tapio.googlemaps.client.LatLon p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.tapio.googlemaps.client.rpcs.MapMovedRpc.class).getMethod("mapMoved"), new Object [] {p0, p1, p2, p3, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.tapio.googlemaps.client.rpcs.MapTypeChangedRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.tapio.googlemaps.client.rpcs.MapTypeChangedRpc() {
                  public void mapTypeChanged(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.tapio.googlemaps.client.rpcs.MapTypeChangedRpc.class).getMethod("mapTypeChanged"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.tapio.googlemaps.client.rpcs.MarkerClickedRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.tapio.googlemaps.client.rpcs.MarkerClickedRpc() {
                  public void markerClicked(long p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.tapio.googlemaps.client.rpcs.MarkerClickedRpc.class).getMethod("markerClicked"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.tapio.googlemaps.client.rpcs.MarkerDraggedRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.tapio.googlemaps.client.rpcs.MarkerDraggedRpc() {
                  public void markerDragged(long p0, com.vaadin.tapio.googlemaps.client.LatLon p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.tapio.googlemaps.client.rpcs.MarkerDraggedRpc.class).getMethod("markerDragged"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new org.vaadin.teemu.ratingstars.gwt.client.RatingStarsServerRpc() {
                  public void valueChanged(double p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsServerRpc.class).getMethod("valueChanged"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setMethodAttribute(com.vaadin.shared.data.DataProviderRpc.class, "insertRowData", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.data.DataProviderRpc.class, "removeRowData", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.data.DataProviderRpc.class, "setRowData", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.data.DataRequestRpc.class, "requestRows", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LOADING_INDICATOR);
            store.setMethodAttribute(com.vaadin.shared.data.DataRequestRpc.class, "setPinned", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.MediaControl.class, "pause", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.MediaControl.class, "play", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.calendar.CalendarServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            store.setMethodAttribute(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, "setChecked", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LOADING_INDICATOR);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LOADING_INDICATOR);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "alignment", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "alignmentBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "altKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "altText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractEmbeddedState.class, "alternateText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "am", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "anchorMarker", new Type(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class));
            store.setPropertyType(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, "animated", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, "animationEnabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "apiKey", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "apiUrl", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "archive", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistivePostfix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistivePrefix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistiveTabStop", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistiveTabStopBottomText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistiveTabStopTopText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "autoPanDisabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "autoplay", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "button", new Type(com.vaadin.shared.MouseEventDetails.MouseButton.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "callbackNames", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "callbackNames", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "captionAsHtml", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class, "cellGroups", new Type("java.util.Map", new Type[] {new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), new Type(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class), }));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class, "cells", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "center", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "centerNELimit", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "centerSWLimit", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "centered", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "checked", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "childCss", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "childData", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "childData", new Type("java.util.HashMap", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "childLocations", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "classId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "clickShortcutKeyCode", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class, "clickable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "clientId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "clientX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "clientY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "closable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "closeTimeout", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "codebase", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "codetype", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column1", new Type(java.lang.Integer.class));
            load4();
          }
          private void load4() {
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column2", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, "columnId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "columnOrder", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "columnReorderingAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "columns", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.grid.GridColumnState.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "columns", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "columns", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "componentError", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, "connector", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "connectorToCssPosition", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "content", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "contentDescription", new Type(com.vaadin.shared.Connector[].class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "contentMode", new Type(com.vaadin.shared.ui.label.ContentMode.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "controls", new Type("java.util.Set", new Type[] {new Type(com.vaadin.tapio.googlemaps.client.GoogleMapControl.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "coordinates", new Type("java.util.List", new Type[] {new Type(com.vaadin.tapio.googlemaps.client.LatLon.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, "coordinates", new Type("java.util.List", new Type[] {new Type(com.vaadin.tapio.googlemaps.client.LatLon.class), }));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "ctrlKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "dateFormat", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "dayNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class, "defaultRow", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "descriptionForAssistiveDevices", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "disableOnClick", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "draggable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "draggable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, "draggable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "editable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "editorCancelCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "editorConnector", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "editorEnabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "editorSaveCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "embedParams", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "expandRatio", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "expandRatio", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "explicitColRatios", new Type("java.util.Set", new Type[] {new Type(java.lang.Integer.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "explicitRowRatios", new Type("java.util.Set", new Type[] {new Type(java.lang.Integer.class), }));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "features", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "fillColor", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "fillOpacity", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, "firstChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "firstDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, "firstDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "fitToBoundsNE", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "fitToBoundsSW", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "footer", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "footer", new Type(com.vaadin.shared.ui.grid.GridStaticSectionState.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "frozenColumnCount", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "geodesic", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, "geodesic", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "hasCellStyleGenerator", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.PageState.class, "hasResizeListeners", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "hasRowStyleGenerator", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "header", new Type(com.vaadin.shared.ui.grid.GridStaticSectionState.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "headerCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "heightByRows", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "heightMode", new Type(com.vaadin.shared.ui.grid.HeightMode.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "hidable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "hidden", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "hideEmptyRowsAndColumns", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "hideOnMouseOut", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "hidingToggleCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "hourMinuteDelimiter", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, "html", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "html", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "iconAltText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "iconAltText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, "iconUrl", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "id", new Type(java.lang.Long.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, "id", new Type(java.lang.Long.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "id", new Type(java.lang.Long.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, "id", new Type(java.lang.Long.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, "indeterminate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class, "infoWindowRenderingDisabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "infoWindows", new Type("java.util.Map", new Type[] {new Type(java.lang.Long.class), new Type(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "inputPrompt", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "key", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "keyboardShortcutsEnabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "kmlLayers", new Type("java.util.Set", new Type[] {new Type(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "language", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.LatLon.class, "lat", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "layout", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "limitCenterBounds", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "limitVisibleAreaBounds", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "loadingIndicatorConfiguration", new Type(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class, "localeData", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.ui.UIState.LocaleData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "localeServiceState", new Type(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "locked", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.LatLon.class, "lon", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "mapTypeId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "markers", new Type("java.util.Map", new Type[] {new Type(java.lang.Long.class), new Type(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "maxLength", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPosition", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPositionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "maxValue", new Type(java.lang.Double.class));
            store.setPropertyType(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, "maxValue", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "maxWidth", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "maxWidth", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "maxWidth", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "maxZoom", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "metaKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPosition", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPositionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "minValue", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "minWidth", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "minZoom", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "modal", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, "mode", new Type(com.vaadin.shared.communication.PushMode.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "monthNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "muted", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "name", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "name", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "names", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "notificationConfigurations", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, "notificationRole", new Type(com.vaadin.shared.ui.ui.NotificationRole.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "openDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, "optimized", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "orientation", new Type(com.vaadin.shared.ui.slider.SliderOrientation.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "overlayContainerLabel", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "pageState", new Type(com.vaadin.shared.ui.ui.PageState.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "parameters", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, "parameters", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "pixelOffsetHeight", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "pixelOffsetWidth", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "pm", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "pollInterval", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "pollingInterval", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "polygons", new Type("java.util.Set", new Type[] {new Type(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "polylines", new Type("java.util.Set", new Type[] {new Type(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class), }));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "position", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "position", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker.class, "position", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionReversed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "positionX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "positionY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, "postfix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, "prefix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "pushConfiguration", new Type(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "quickOpenDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "quickOpenTimeout", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.TextualDateFieldState.class, "rangeEnd", new Type(java.util.Date.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.TextualDateFieldState.class, "rangeStart", new Type(java.util.Date.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "relativeX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "relativeY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "rendererConnector", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "resizable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "resizeLazy", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "resolution", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "role", new Type(com.vaadin.shared.ui.window.WindowRole.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row1", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row2", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.class, "rows", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "rpcInterfaces", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "rpcInterfaces", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), }));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "scrollLeft", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "scrollTop", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "scrollWheelEnabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, "secondChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, "secondDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "selected", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "selectedKeys", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "selectionMode", new Type(com.vaadin.shared.ui.grid.GridState.SharedSelectionMode.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "shiftKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "shortDayNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "shortMonthNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "showControls", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "singleSelectDeselectAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "sortColumns", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "sortDirs", new Type(com.vaadin.shared.data.sort.SortDirection[].class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "sortable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "sourceTypes", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "sources", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, "splitterState", new Type(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "standby", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, "state", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "strokeColor", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, "strokeColor", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "strokeOpacity", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, "strokeOpacity", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "strokeWeight", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, "strokeWeight", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.RowState.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabCaptionsAsHtml", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.TabIndexState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabs", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.tabsheet.TabState.class), }));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabsVisible", new Type(java.lang.Boolean.class));
            load5();
          }
          private void load5() {
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "target", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "target", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "targetBorder", new Type(com.vaadin.shared.ui.BorderStyle.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "targetHeight", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "targetWidth", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateContents", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "textFieldEnabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "theme", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, "thirdDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.PageState.class, "title", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "tooltipConfiguration", new Type(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "trafficLayerVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "twelveHourClock", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "type", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.CellState.class, "type", new Type(com.vaadin.shared.ui.grid.GridStaticCellType.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "uriFragment", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class, "url", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "value", new Type(java.lang.Double.class));
            store.setPropertyType(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, "value", new Type(java.lang.Double.class));
            store.setPropertyType(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, "valueCaptions", new Type("java.util.Map", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer.class, "viewportPreserved", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridStaticSectionState.class, "visible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "visible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "visibleAreaNELimit", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "visibleAreaSWLimit", new Type(com.vaadin.tapio.googlemaps.client.LatLon.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridColumnState.class, "width", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "windowMode", new Type(com.vaadin.shared.ui.window.WindowMode.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordwrap", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow.class, "zIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon.class, "zIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline.class, "zIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.tapio.googlemaps.client.GoogleMapState.class, "zoom", new Type(java.lang.Integer.class));
            store.setSerializerFactory(com.vaadin.shared.MouseEventDetails.MouseButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.MouseEventDetails.MouseButton>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.MouseEventDetails.MouseButton value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.MouseEventDetails.MouseButton castedValue = (com.vaadin.shared.MouseEventDetails.MouseButton) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.MouseEventDetails.MouseButton deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("LEFT".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.LEFT;
                    }
                    if ("RIGHT".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.RIGHT;
                    }
                    if ("MIDDLE".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.MIDDLE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.communication.PushMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.communication.PushMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.communication.PushMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.communication.PushMode castedValue = (com.vaadin.shared.communication.PushMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.communication.PushMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("DISABLED".equals(enumIdentifier)) {
                      return com.vaadin.shared.communication.PushMode.DISABLED;
                    }
                    if ("MANUAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.communication.PushMode.MANUAL;
                    }
                    if ("AUTOMATIC".equals(enumIdentifier)) {
                      return com.vaadin.shared.communication.PushMode.AUTOMATIC;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.communication.URLReference.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.communication.URLReference_Serializer.class);
              }
            });
            store.setSerializerFactory(com.vaadin.shared.data.sort.SortDirection.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.data.sort.SortDirection>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.data.sort.SortDirection value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.data.sort.SortDirection castedValue = (com.vaadin.shared.data.sort.SortDirection) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.data.sort.SortDirection deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ASCENDING".equals(enumIdentifier)) {
                      return com.vaadin.shared.data.sort.SortDirection.ASCENDING;
                    }
                    if ("DESCENDING".equals(enumIdentifier)) {
                      return com.vaadin.shared.data.sort.SortDirection.DESCENDING;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.BorderStyle.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.BorderStyle>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.BorderStyle value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.BorderStyle castedValue = (com.vaadin.shared.ui.BorderStyle) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.BorderStyle deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("NONE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.BorderStyle.NONE;
                    }
                    if ("MINIMAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.BorderStyle.MINIMAL;
                    }
                    if ("DEFAULT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.BorderStyle.DEFAULT;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.GridState.SharedSelectionMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.GridState.SharedSelectionMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.GridState.SharedSelectionMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.GridState.SharedSelectionMode castedValue = (com.vaadin.shared.ui.grid.GridState.SharedSelectionMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.GridState.SharedSelectionMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("SINGLE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridState.SharedSelectionMode.SINGLE;
                    }
                    if ("MULTI".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridState.SharedSelectionMode.MULTI;
                    }
                    if ("NONE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridState.SharedSelectionMode.NONE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.GridStaticCellType.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.GridStaticCellType>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.GridStaticCellType value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.GridStaticCellType castedValue = (com.vaadin.shared.ui.grid.GridStaticCellType) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.GridStaticCellType deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("TEXT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridStaticCellType.TEXT;
                    }
                    if ("HTML".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridStaticCellType.HTML;
                    }
                    if ("WIDGET".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridStaticCellType.WIDGET;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.HeightMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.HeightMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.HeightMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.HeightMode castedValue = (com.vaadin.shared.ui.grid.HeightMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.HeightMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("CSS".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.HeightMode.CSS;
                    }
                    if ("ROW".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.HeightMode.ROW;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.ScrollDestination.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.ScrollDestination>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.ScrollDestination value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.ScrollDestination castedValue = (com.vaadin.shared.ui.grid.ScrollDestination) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.ScrollDestination deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ANY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.ANY;
                    }
                    if ("START".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.START;
                    }
                    if ("MIDDLE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.MIDDLE;
                    }
                    if ("END".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.END;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.label.ContentMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.label.ContentMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.label.ContentMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.label.ContentMode castedValue = (com.vaadin.shared.ui.label.ContentMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.label.ContentMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("TEXT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.TEXT;
                    }
                    if ("PREFORMATTED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.PREFORMATTED;
                    }
                    if ("HTML".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.HTML;
                    }
                    if ("XML".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.XML;
                    }
                    if ("RAW".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.RAW;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.slider.SliderOrientation.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.slider.SliderOrientation>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.slider.SliderOrientation value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.slider.SliderOrientation castedValue = (com.vaadin.shared.ui.slider.SliderOrientation) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.slider.SliderOrientation deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("HORIZONTAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.slider.SliderOrientation.HORIZONTAL;
                    }
                    if ("VERTICAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.slider.SliderOrientation.VERTICAL;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.ui.NotificationRole.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.ui.NotificationRole>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.ui.NotificationRole value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.ui.NotificationRole castedValue = (com.vaadin.shared.ui.ui.NotificationRole) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.ui.NotificationRole deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ALERT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ui.NotificationRole.ALERT;
                    }
                    if ("STATUS".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ui.NotificationRole.STATUS;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.window.WindowMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.window.WindowMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.window.WindowMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.window.WindowMode castedValue = (com.vaadin.shared.ui.window.WindowMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.window.WindowMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("NORMAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowMode.NORMAL;
                    }
                    if ("MAXIMIZED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowMode.MAXIMIZED;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.window.WindowRole.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.window.WindowRole>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.window.WindowRole value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.window.WindowRole castedValue = (com.vaadin.shared.ui.window.WindowRole) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.window.WindowRole deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ALERTDIALOG".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowRole.ALERTDIALOG;
                    }
                    if ("DIALOG".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowRole.DIALOG;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.tapio.googlemaps.client.GoogleMapControl.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.tapio.googlemaps.client.GoogleMapControl>() {
                  public elemental.json.JsonValue serialize(com.vaadin.tapio.googlemaps.client.GoogleMapControl value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.tapio.googlemaps.client.GoogleMapControl castedValue = (com.vaadin.tapio.googlemaps.client.GoogleMapControl) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.tapio.googlemaps.client.GoogleMapControl deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("MapType".equals(enumIdentifier)) {
                      return com.vaadin.tapio.googlemaps.client.GoogleMapControl.MapType;
                    }
                    if ("OverView".equals(enumIdentifier)) {
                      return com.vaadin.tapio.googlemaps.client.GoogleMapControl.OverView;
                    }
                    if ("Pan".equals(enumIdentifier)) {
                      return com.vaadin.tapio.googlemaps.client.GoogleMapControl.Pan;
                    }
                    if ("Rotate".equals(enumIdentifier)) {
                      return com.vaadin.tapio.googlemaps.client.GoogleMapControl.Rotate;
                    }
                    if ("Scale".equals(enumIdentifier)) {
                      return com.vaadin.tapio.googlemaps.client.GoogleMapControl.Scale;
                    }
                    if ("StreetView".equals(enumIdentifier)) {
                      return com.vaadin.tapio.googlemaps.client.GoogleMapControl.StreetView;
                    }
                    if ("Zoom".equals(enumIdentifier)) {
                      return com.vaadin.tapio.googlemaps.client.GoogleMapControl.Zoom;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(java.util.Date.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.communication.Date_Serializer.class);
              }
            });
            store.setSerializerFactory(com.vaadin.shared.Connector[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.Connector[]>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.Connector[] value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.Connector[] castedValue = (com.vaadin.shared.Connector[]) value;
                    elemental.json.JsonArray values = elemental.json.Json.createArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(com.vaadin.shared.Connector.class), connection));
                    }
                    return values;
                  }
                  public com.vaadin.shared.Connector[] deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    elemental.json.JsonArray jsonArray = (elemental.json.JsonArray)jsonValue;
                    com.vaadin.shared.Connector[] value = new com.vaadin.shared.Connector[jsonArray.length()];
                    for(int i = 0 ; i < value.length; i++) {
                      value[i] = (com.vaadin.shared.Connector) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(com.vaadin.shared.Connector.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.data.sort.SortDirection[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.data.sort.SortDirection[]>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.data.sort.SortDirection[] value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.data.sort.SortDirection[] castedValue = (com.vaadin.shared.data.sort.SortDirection[]) value;
                    elemental.json.JsonArray values = elemental.json.Json.createArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(com.vaadin.shared.data.sort.SortDirection.class), connection));
                    }
                    return values;
                  }
                  public com.vaadin.shared.data.sort.SortDirection[] deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    elemental.json.JsonArray jsonArray = (elemental.json.JsonArray)jsonValue;
                    com.vaadin.shared.data.sort.SortDirection[] value = new com.vaadin.shared.data.sort.SortDirection[jsonArray.length()];
                    for(int i = 0 ; i < value.length; i++) {
                      value[i] = (com.vaadin.shared.data.sort.SortDirection) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(com.vaadin.shared.data.sort.SortDirection.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
            store.setSerializerFactory(java.lang.String[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<java.lang.String[]>() {
                  public elemental.json.JsonValue serialize(java.lang.String[] value, com.vaadin.client.ApplicationConnection connection) {
                    java.lang.String[] castedValue = (java.lang.String[]) value;
                    elemental.json.JsonArray values = elemental.json.Json.createArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(java.lang.String.class), connection));
                    }
                    return values;
                  }
                  public java.lang.String[] deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    elemental.json.JsonArray jsonArray = (elemental.json.JsonArray)jsonValue;
                    java.lang.String[] value = new java.lang.String[jsonArray.length()];
                    for(int i = 0 ; i < value.length; i++) {
                      value[i] = (java.lang.String) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(java.lang.String.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
            store.setPresentationType(com.vaadin.client.connectors.ButtonRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.DateRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.ImageRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.JavaScriptRendererConnector.class, elemental.json.JsonValue.class);
            store.setPresentationType(com.vaadin.client.connectors.NumberRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.ProgressBarRendererConnector.class, java.lang.Double.class);
            store.setPresentationType(com.vaadin.client.connectors.TextRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.UnsafeHtmlRendererConnector.class, java.lang.String.class);
            store.setDelegateToWidget(com.vaadin.shared.ui.accordion.AccordionState.class, "tabCaptionsAsHtml", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "columnReorderingAllowed", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "editorCancelCaption", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "editorSaveCaption", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "heightByRows", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "heightMode", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabCaptionsAsHtml", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordwrap", "");
            store.setDelegateToWidget(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, "animated", "setAnimationEnabled");
            store.setDelegateToWidget(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, "maxValue", "setMaxValue");
            store.setDelegateToWidget(org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState.class, "value", "setValue");
            store.addOnStateChangeMethod(com.vaadin.client.connectors.GridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onCellStyleGeneratorChange", new String[] {"hasCellStyleGenerator", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.GridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onRowStyleGeneratorChange", new String[] {"hasRowStyleGenerator", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onResourceChange", new String[] {"resources", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("setCaption", new String[] {"caption", "captionAsHtml", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("setClickShortcut", new String[] {"clickShortcutKeyCode", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("setErrorMessage", new String[] {"errorMessage", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("setIconAltText", new String[] {"iconAltText", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onServerEventListenerChanged", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.ui.UIConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onThemeChange", new String[] {"theme", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::alignment = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::alignment);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'alignment', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::alignmentBitmask = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::alignmentBitmask);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::class, 'alignmentBitmask', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setAltKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isAltKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'altKey', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::altText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractMediaState::altText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'altText', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractEmbeddedState::alternateText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractEmbeddedState::alternateText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractEmbeddedState::class, 'alternateText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::am = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::am;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'am', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setAnchorMarker(Lcom/vaadin/tapio/googlemaps/client/overlays/GoogleMapMarker;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getAnchorMarker()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'anchorMarker', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::animated = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::animated);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::class, 'animated', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::setAnimationEnabled(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::isAnimationEnabled()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::class, 'animationEnabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::apiKey = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::apiKey;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'apiKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::apiUrl = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::apiUrl;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'apiUrl', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::archive = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::archive;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'archive', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistivePostfix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistivePostfix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistivePostfix', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistivePrefix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistivePrefix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistivePrefix', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStop = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStop);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistiveTabStop', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopBottomText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopBottomText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistiveTabStopBottomText', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopTopText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopTopText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistiveTabStopTopText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setAutoPanDisabled(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::isAutoPanDisabled()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'autoPanDisabled', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::autoplay = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::autoplay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'autoplay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setButton(Lcom/vaadin/shared/MouseEventDetails$MouseButton;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.MouseEventDetails::getButton()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'button', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.JavaScriptExtensionState::setCallbackNames(Ljava/util/Set;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.JavaScriptExtensionState::getCallbackNames()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.JavaScriptExtensionState::class, 'callbackNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.JavaScriptComponentState::setCallbackNames(Ljava/util/Set;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.JavaScriptComponentState::getCallbackNames()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.JavaScriptComponentState::class, 'callbackNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::setCaption(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::getCaption()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::captionAsHtml = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractComponentState::captionAsHtml);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'captionAsHtml', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::cellGroups = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::cellGroups;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::class, 'cellGroups', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::cells = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::cells;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::class, 'cells', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::center = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::center;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'center', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::centerNELimit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::centerNELimit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'centerNELimit', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::centerSWLimit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::centerSWLimit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'centerSWLimit', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::centered = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::centered);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'centered', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.checkbox.CheckBoxState::checked = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.checkbox.CheckBoxState::checked);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.checkbox.CheckBoxState::class, 'checked', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.csslayout.CssLayoutState::childCss = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.csslayout.CssLayoutState::childCss;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.csslayout.CssLayoutState::class, 'childCss', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::childData = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::childData;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'childData', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::childData = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::childData;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::class, 'childData', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::childLocations = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::childLocations;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.customlayout.CustomLayoutState::class, 'childLocations', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::classId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::classId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'classId', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.button.ButtonState::clickShortcutKeyCode = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.button.ButtonState::clickShortcutKeyCode);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.button.ButtonState::class, 'clickShortcutKeyCode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::setClickable(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::isClickable()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::class, 'clickable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::clientId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::clientId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'clientId', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setClientX(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getClientX()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'clientX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setClientY(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getClientY()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'clientY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::closable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabState::closable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'closable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::closeTimeout = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::closeTimeout);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'closeTimeout', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::codebase = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::codebase;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'codebase', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::codetype = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::codetype;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'codetype', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column1 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column1);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'column1', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column2 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column2);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'column2', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::columnId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::columnId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::class, 'columnId', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::columnOrder = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::columnOrder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'columnOrder', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::columnReorderingAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridState::columnReorderingAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'columnReorderingAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::columns = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::columns;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'columns', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::columns = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::columns);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'columns', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::columns = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::columns);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'columns', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::componentError = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::componentError;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'componentError', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::connector = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::connector;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::class, 'connector', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState::connectorToCssPosition = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState::connectorToCssPosition;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState::class, 'connectorToCssPosition', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setContent(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getContent()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'content', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs0(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::contentDescription = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::contentDescription;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'contentDescription', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.label.LabelState::contentMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.label.LabelState::contentMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.label.LabelState::class, 'contentMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::controls = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::controls;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'controls', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setCoordinates(Ljava/util/List;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getCoordinates()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'coordinates', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::setCoordinates(Ljava/util/List;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::getCoordinates()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::class, 'coordinates', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setCtrlKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isCtrlKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'ctrlKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dateFormat = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dateFormat;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'dateFormat', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dayNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dayNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'dayNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::defaultRow = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::defaultRow);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::class, 'defaultRow', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::description = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::description;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'description', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::description = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::description;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'description', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.PopupDateFieldState::descriptionForAssistiveDevices = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.PopupDateFieldState::descriptionForAssistiveDevices;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.PopupDateFieldState::class, 'descriptionForAssistiveDevices', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.button.ButtonState::disableOnClick = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.button.ButtonState::disableOnClick);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.button.ButtonState::class, 'disableOnClick', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::draggable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::draggable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'draggable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::draggable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::draggable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'draggable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::setDraggable(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::isDraggable()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::class, 'draggable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::editable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridColumnState::editable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'editable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::editorCancelCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::editorCancelCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'editorCancelCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::editorConnector = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridColumnState::editorConnector;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'editorConnector', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::editorEnabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridState::editorEnabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'editorEnabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::editorSaveCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::editorSaveCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'editorSaveCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::embedParams = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::embedParams;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'embedParams', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.communication.SharedState::enabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.communication.SharedState::enabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.communication.SharedState::class, 'enabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::enabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabState::enabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'enabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::errorMessage = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::errorMessage;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'errorMessage', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::expandRatio = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.grid.GridColumnState::expandRatio);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'expandRatio', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::expandRatio = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::expandRatio);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::class, 'expandRatio', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitColRatios = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitColRatios;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'explicitColRatios', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitRowRatios = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitRowRatios;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'explicitRowRatios', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::features = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::features;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'features', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setFillColor(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getFillColor()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'fillColor', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setFillOpacity(D)(value.@java.lang.Double::doubleValue()());
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getFillOpacity()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'fillOpacity', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::firstChild = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::firstChild;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::class, 'firstChild', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::firstDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::firstDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'firstDayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::firstDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::firstDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::class, 'firstDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::fitToBoundsNE = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::fitToBoundsNE;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'fitToBoundsNE', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::fitToBoundsSW = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::fitToBoundsSW;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'fitToBoundsSW', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.form.FormState::footer = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.form.FormState::footer;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.form.FormState::class, 'footer', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::footer = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::footer;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'footer', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::frozenColumnCount = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.grid.GridState::frozenColumnCount);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'frozenColumnCount', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setGeodesic(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::isGeodesic()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'geodesic', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::setGeodesic(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::isGeodesic()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::class, 'geodesic', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::hasCellStyleGenerator = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridState::hasCellStyleGenerator);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'hasCellStyleGenerator', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.PageState::hasResizeListeners = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.ui.PageState::hasResizeListeners);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.PageState::class, 'hasResizeListeners', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::hasRowStyleGenerator = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridState::hasRowStyleGenerator);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'hasRowStyleGenerator', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::header = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::header;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'header', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::headerCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridColumnState::headerCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'headerCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::height = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::height;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'height', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setHeight(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getHeight()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'height', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::heightByRows = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridState::heightByRows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'heightByRows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::heightMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::heightMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'heightMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::hidable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridColumnState::hidable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'hidable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::hidden = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridColumnState::hidden);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'hidden', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::hideEmptyRowsAndColumns = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::hideEmptyRowsAndColumns);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'hideEmptyRowsAndColumns', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractFieldState::hideErrors = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractFieldState::hideErrors);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractFieldState::class, 'hideErrors', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.popupview.PopupViewState::hideOnMouseOut = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.popupview.PopupViewState::hideOnMouseOut);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.popupview.PopupViewState::class, 'hideOnMouseOut', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::hidingToggleCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridColumnState::hidingToggleCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'hidingToggleCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::hourMinuteDelimiter = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::hourMinuteDelimiter;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'hourMinuteDelimiter', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::html = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::html;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::class, 'html', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs1(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.popupview.PopupViewState::html = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.popupview.PopupViewState::html;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.popupview.PopupViewState::class, 'html', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::htmlContentAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::htmlContentAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'htmlContentAllowed', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.button.ButtonState::iconAltText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.button.ButtonState::iconAltText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.button.ButtonState::class, 'iconAltText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::iconAltText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::iconAltText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'iconAltText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::setIconUrl(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::getIconUrl()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::class, 'iconUrl', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::id = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::id;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::id = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridColumnState::id;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::id = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::id;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setId(J)(value.@java.lang.Long::longValue()());
              },
              getter: function(bean) {
                return @java.lang.Long::valueOf(J)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getId()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::setId(J)(value.@java.lang.Long::longValue()());
              },
              getter: function(bean) {
                return @java.lang.Long::valueOf(J)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::getId()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setId(J)(value.@java.lang.Long::longValue()());
              },
              getter: function(bean) {
                return @java.lang.Long::valueOf(J)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getId()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::setId(J)(value.@java.lang.Long::longValue()());
              },
              getter: function(bean) {
                return @java.lang.Long::valueOf(J)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::getId()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::class, 'id', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::immediate = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractComponentState::immediate);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'immediate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::indeterminate = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::indeterminate);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.progressindicator.ProgressBarState::class, 'indeterminate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::setInfoWindowRenderingDisabled(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::isInfoWindowRenderingDisabled()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::class, 'infoWindowRenderingDisabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::infoWindows = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::infoWindows;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'infoWindows', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::inputPrompt = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::inputPrompt;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'inputPrompt', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::key = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::key;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'key', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::keyboardShortcutsEnabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::keyboardShortcutsEnabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'keyboardShortcutsEnabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::kmlLayers = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::kmlLayers;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'kmlLayers', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::language = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::language;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'language', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.LatLon::setLat(D)(value.@java.lang.Double::doubleValue()());
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.tapio.googlemaps.client.LatLon::getLat()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.LatLon::class, 'lat', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.form.FormState::layout = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.form.FormState::layout;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.form.FormState::class, 'layout', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::limitCenterBounds = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::limitCenterBounds);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'limitCenterBounds', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::limitVisibleAreaBounds = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::limitVisibleAreaBounds);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'limitVisibleAreaBounds', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::loadingIndicatorConfiguration = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::loadingIndicatorConfiguration;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'loadingIndicatorConfiguration', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleServiceState::localeData = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleServiceState::localeData;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleServiceState::class, 'localeData', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::localeServiceState = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::localeServiceState;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'localeServiceState', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::locked = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::locked);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'locked', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.LatLon::setLon(D)(value.@java.lang.Double::doubleValue()());
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.tapio.googlemaps.client.LatLon::getLon()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.LatLon::class, 'lon', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::mapTypeId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::mapTypeId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'mapTypeId', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::marginsBitmask = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::marginsBitmask);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'marginsBitmask', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::marginsBitmask = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::marginsBitmask);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::class, 'marginsBitmask', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::markers = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::markers;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'markers', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::maxLength = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::maxLength);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'maxLength', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPosition = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPosition);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'maxPosition', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPositionUnit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPositionUnit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'maxPositionUnit', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::maxValue = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.slider.SliderState::maxValue);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'maxValue', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::maxValue = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::maxValue);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::class, 'maxValue', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::maxWidth = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridColumnState::maxWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'maxWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::maxWidth = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::maxWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'maxWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setMaxWidth(Ljava/lang/Integer;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getMaxWidth()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'maxWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::maxZoom = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::maxZoom);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'maxZoom', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setMetaKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isMetaKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'metaKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPosition = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPosition);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'minPosition', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPositionUnit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPositionUnit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'minPositionUnit', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::minValue = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.slider.SliderState::minValue);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'minValue', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::minWidth = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridColumnState::minWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'minWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::minZoom = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::minZoom);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'minZoom', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::modal = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::modal);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'modal', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::mode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::mode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::class, 'mode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractFieldState::modified = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractFieldState::modified);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractFieldState::class, 'modified', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::monthNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::monthNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'monthNames', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::muted = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::muted);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'muted', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::name = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.link.LinkState::name;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'name', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::name = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::name;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'name', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState::names = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState::names;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState::class, 'names', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::notificationConfigurations = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::notificationConfigurations;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'notificationConfigurations', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs2(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::notificationRole = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::notificationRole;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::class, 'notificationRole', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::openDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::openDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'openDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::setOptimized(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::isOptimized()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::class, 'optimized', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::orientation = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.slider.SliderState::orientation;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'orientation', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::overlayContainerLabel = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::overlayContainerLabel;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'overlayContainerLabel', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::pageState = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::pageState;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'pageState', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::parameters = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::parameters;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'parameters', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::parameters = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::parameters;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::class, 'parameters', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setPixelOffsetHeight(Ljava/lang/Integer;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getPixelOffsetHeight()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'pixelOffsetHeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setPixelOffsetWidth(Ljava/lang/Integer;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getPixelOffsetWidth()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'pixelOffsetWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::pm = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::pm;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'pm', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::pollInterval = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState::pollInterval);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'pollInterval', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.progressindicator.ProgressIndicatorState::pollingInterval = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.progressindicator.ProgressIndicatorState::pollingInterval);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.progressindicator.ProgressIndicatorState::class, 'pollingInterval', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::polygons = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::polygons;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'polygons', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::polylines = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::polylines;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'polylines', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::position = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::position);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'position', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setPosition(Lcom/vaadin/tapio/googlemaps/client/LatLon;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getPosition()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'position', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::setPosition(Lcom/vaadin/tapio/googlemaps/client/LatLon;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::getPosition()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker::class, 'position', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionReversed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionReversed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'positionReversed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionUnit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionUnit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'positionUnit', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::positionX = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.window.WindowState::positionX);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'positionX', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::positionY = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.window.WindowState::positionY);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'positionY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::postfix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::postfix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::class, 'postfix', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::prefix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::prefix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::class, 'prefix', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::primaryStyleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::primaryStyleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'primaryStyleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractFieldState::propertyReadOnly = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractFieldState::propertyReadOnly);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractFieldState::class, 'propertyReadOnly', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::pushConfiguration = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::pushConfiguration;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'pushConfiguration', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'quickOpenDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenTimeout = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenTimeout);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'quickOpenTimeout', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::rangeEnd = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::rangeEnd;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.TextualDateFieldState::class, 'rangeEnd', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::rangeStart = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::rangeStart;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.TextualDateFieldState::class, 'rangeStart', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::readOnly = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractComponentState::readOnly);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'readOnly', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.communication.SharedState::registeredEventListeners = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.communication.SharedState::registeredEventListeners;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.communication.SharedState::class, 'registeredEventListeners', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setRelativeX(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getRelativeX()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'relativeX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setRelativeY(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getRelativeY()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'relativeY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::rendererConnector = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridColumnState::rendererConnector;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'rendererConnector', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractFieldState::required = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractFieldState::required);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractFieldState::class, 'required', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::resizable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::resizable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'resizable', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::resizeLazy = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::resizeLazy);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'resizeLazy', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::resolution = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.slider.SliderState::resolution);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'resolution', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.communication.SharedState::resources = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.communication.SharedState::resources;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.communication.SharedState::class, 'resources', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::role = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::role;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'role', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row1 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row1);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'row1', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row2 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row2);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'row2', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState::rows = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState::rows;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::rows = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::rows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textarea.TextAreaState::rows = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.textarea.TextAreaState::rows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textarea.TextAreaState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.JavaScriptExtensionState::setRpcInterfaces(Ljava/util/Map;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.JavaScriptExtensionState::getRpcInterfaces()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.JavaScriptExtensionState::class, 'rpcInterfaces', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.JavaScriptComponentState::setRpcInterfaces(Ljava/util/Map;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.JavaScriptComponentState::getRpcInterfaces()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.JavaScriptComponentState::class, 'rpcInterfaces', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.panel.PanelState::scrollLeft = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.panel.PanelState::scrollLeft);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.panel.PanelState::class, 'scrollLeft', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.panel.PanelState::scrollTop = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.panel.PanelState::scrollTop);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.panel.PanelState::class, 'scrollTop', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::scrollWheelEnabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::scrollWheelEnabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'scrollWheelEnabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::secondChild = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::secondChild;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::class, 'secondChild', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::secondDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::secondDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::class, 'secondDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::selected = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::selected;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'selected', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::selectedKeys = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::selectedKeys;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'selectedKeys', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::selectionMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::selectionMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'selectionMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setShiftKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isShiftKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'shiftKey', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs3(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortDayNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortDayNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'shortDayNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortMonthNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortMonthNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'shortMonthNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::showControls = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::showControls);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'showControls', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::singleSelectDeselectAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridState::singleSelectDeselectAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'singleSelectDeselectAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::sortColumns = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::sortColumns;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'sortColumns', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::sortDirs = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::sortDirs;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'sortDirs', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::sortable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridColumnState::sortable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'sortable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::sourceTypes = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractMediaState::sourceTypes;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'sourceTypes', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::sources = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractMediaState::sources;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'sources', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::spacing = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::spacing);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'spacing', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::spacing = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::spacing);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::class, 'spacing', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::splitterState = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::splitterState;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::class, 'splitterState', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::standby = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::standby;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'standby', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::state = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::state;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.progressindicator.ProgressBarState::class, 'state', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setStrokeColor(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getStrokeColor()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'strokeColor', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::setStrokeColor(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::getStrokeColor()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::class, 'strokeColor', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setStrokeOpacity(D)(value.@java.lang.Double::doubleValue()());
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getStrokeOpacity()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'strokeOpacity', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::setStrokeOpacity(D)(value.@java.lang.Double::doubleValue()());
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::getStrokeOpacity()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::class, 'strokeOpacity', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setStrokeWeight(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getStrokeWeight()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'strokeWeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::setStrokeWeight(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::getStrokeWeight()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::class, 'strokeWeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.RowState::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::styles = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::styles;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'styles', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabCaptionsAsHtml = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabCaptionsAsHtml);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabCaptionsAsHtml', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.TabIndexState::tabIndex = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.TabIndexState::tabIndex);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.TabIndexState::class, 'tabIndex', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.panel.PanelState::tabIndex = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.panel.PanelState::tabIndex);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.panel.PanelState::class, 'tabIndex', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabIndex = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabIndex);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabIndex', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabs = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabs;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabs', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabsVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabsVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabsVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::target = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::target;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'target', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::target = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.link.LinkState::target;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'target', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::targetBorder = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.link.LinkState::targetBorder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'targetBorder', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::targetHeight = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.link.LinkState::targetHeight);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'targetHeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::targetWidth = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.link.LinkState::targetWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'targetWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateContents = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateContents;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.customlayout.CustomLayoutState::class, 'templateContents', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.customlayout.CustomLayoutState::class, 'templateName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::text = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::text;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::class, 'text', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.label.LabelState::text = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.label.LabelState::text;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.label.LabelState::class, 'text', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::text = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::text;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'text', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.PopupDateFieldState::textFieldEnabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.datefield.PopupDateFieldState::textFieldEnabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.PopupDateFieldState::class, 'textFieldEnabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::theme = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::theme;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'theme', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::thirdDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::thirdDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::class, 'thirdDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.PageState::title = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.PageState::title;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.PageState::class, 'title', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::tooltipConfiguration = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::tooltipConfiguration;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'tooltipConfiguration', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::trafficLayerVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::trafficLayerVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'trafficLayerVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::twelveHourClock = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::twelveHourClock);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'twelveHourClock', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setType(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getType()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'type', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::type = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::type;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState.CellState::class, 'type', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::uriFragment = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::uriFragment;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'uriFragment', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::setUrl(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::getUrl()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::class, 'url', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::value = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.slider.SliderState::value);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'value', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::value = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::value;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::class, 'value', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::valueCaptions = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::valueCaptions;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.teemu.ratingstars.gwt.client.RatingStarsState::class, 'valueCaptions', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::setViewportPreserved(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::isViewportPreserved()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.layers.GoogleMapKmlLayer::class, 'viewportPreserved', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridStaticSectionState::visible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridStaticSectionState::visible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridStaticSectionState::class, 'visible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::visible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabState::visible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'visible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::visibleAreaNELimit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::visibleAreaNELimit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'visibleAreaNELimit', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::visibleAreaSWLimit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::visibleAreaSWLimit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'visibleAreaSWLimit', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs4(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::width = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::width;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'width', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridColumnState::width = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridColumnState::width);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridColumnState::class, 'width', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setWidth(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getWidth()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'width', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::windowMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::windowMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'windowMode', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textarea.TextAreaState::wordwrap = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.textarea.TextAreaState::wordwrap);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textarea.TextAreaState::class, 'wordwrap', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::setzIndex(Ljava/lang/Integer;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::getzIndex()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow::class, 'zIndex', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::setzIndex(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::getzIndex()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon::class, 'zIndex', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::setzIndex(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::getzIndex()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline::class, 'zIndex', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::zoom = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.tapio.googlemaps.client.GoogleMapState::zoom);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.tapio.googlemaps.client.GoogleMapState::class, 'zoom', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
            loadNativeJs0(store);
            loadNativeJs1(store);
            loadNativeJs2(store);
            loadNativeJs3(store);
            loadNativeJs4(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        }.onSuccess();
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("__deferred", new String[] {}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            loadJsBundle(store);
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("CalendarConnector", new String[] {"com.vaadin.ui.Calendar",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.calendar.CalendarState.Action.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.calendar.CalendarState.Day.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.calendar.CalendarState.Event.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.calendar.CalendarState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setClass("com.vaadin.ui.Calendar", com.vaadin.client.ui.calendar.CalendarConnector.class);
            store.setConstructor(com.vaadin.client.ui.VCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.calendar.CalendarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.calendar.CalendarConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.calendar.CalendarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.calendar.CalendarState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.calendar.CalendarState.Action.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.calendar.CalendarState.Action.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.calendar.CalendarState.Day.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.calendar.CalendarState.Day.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.calendar.CalendarState.Event.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.calendar.CalendarState.Event.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.calendar.CalendarConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCalendar.class));
            store.setReturnType(com.vaadin.client.ui.calendar.CalendarConnector.class, "getState", new Type(com.vaadin.shared.ui.calendar.CalendarState.class));
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Action.class, "actionKey", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "actions", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.calendar.CalendarState.Action.class), }));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "allDay", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Action.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Day.class, "date", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "dateFrom", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "dateTo", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "dayNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Day.class, "dayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "days", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.calendar.CalendarState.Day.class), }));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Action.class, "endDate", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "eventCaptionAsHtml", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "events", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.calendar.CalendarState.Event.class), }));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "firstDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "firstHourOfDay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "firstVisibleDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "format24H", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Action.class, "iconKey", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "index", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "lastHourOfDay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "lastVisibleDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Day.class, "localizedDateFormat", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "monthNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "now", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.class, "scroll", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Action.class, "startDate", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "timeFrom", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Event.class, "timeTo", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Day.class, "week", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.calendar.CalendarState.Day.class, "yearOfWeek", new Type(java.lang.Integer.class));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::actionKey = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::actionKey;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Action::class, 'actionKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::actions = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState::actions;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'actions', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::allDay = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::allDay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'allDay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Action::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::date = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::date;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Day::class, 'date', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::dateFrom = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::dateFrom;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'dateFrom', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::dateTo = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::dateTo;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'dateTo', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::dayNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState::dayNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'dayNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::dayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::dayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Day::class, 'dayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::days = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState::days;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'days', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::description = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::description;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'description', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::endDate = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::endDate;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Action::class, 'endDate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::eventCaptionAsHtml = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.calendar.CalendarState::eventCaptionAsHtml);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'eventCaptionAsHtml', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::events = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState::events;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'events', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::firstDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState::firstDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'firstDayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::firstHourOfDay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState::firstHourOfDay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'firstHourOfDay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::firstVisibleDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState::firstVisibleDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'firstVisibleDayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::format24H = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.calendar.CalendarState::format24H);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'format24H', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::iconKey = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::iconKey;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Action::class, 'iconKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::index = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::index);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'index', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::lastHourOfDay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState::lastHourOfDay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'lastHourOfDay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::lastVisibleDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState::lastVisibleDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'lastVisibleDayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::localizedDateFormat = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::localizedDateFormat;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Day::class, 'localizedDateFormat', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::monthNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState::monthNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'monthNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::now = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState::now;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'now', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState::scroll = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState::scroll);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState::class, 'scroll', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::startDate = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Action::startDate;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Action::class, 'startDate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::timeFrom = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::timeFrom;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'timeFrom', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::timeTo = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.calendar.CalendarState.Event::timeTo;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Event::class, 'timeTo', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::week = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::week);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Day::class, 'week', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::yearOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.calendar.CalendarState.Day::yearOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.calendar.CalendarState.Day::class, 'yearOfWeek', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerConnector", new String[] {"com.vaadin.ui.ColorPicker",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setClass("com.vaadin.ui.ColorPicker", com.vaadin.client.ui.colorpicker.ColorPickerConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, "getWidget", new Type(com.vaadin.client.ui.VColorPicker.class));
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerState.class));
            store.setInvoker(com.vaadin.client.ui.VColorPicker.class, "setColor",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPicker) target).setColor((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VColorPicker.class, "setOpen",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPicker) target).setOpen((java.lang.Boolean) params[0]);
                return null;
              }
            });
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Type(java.lang.Boolean.class));
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", "setColor");
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", "setOpen");
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::color = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::color;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerState::class, 'color', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::popupVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::popupVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerState::class, 'popupVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::showDefaultCaption = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::showDefaultCaption);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerState::class, 'showDefaultCaption', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerAreaConnector", new String[] {"com.vaadin.ui.ColorPickerArea",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setClass("com.vaadin.ui.ColorPickerArea", com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VColorPickerArea.class));
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerState.class));
            store.setInvoker(com.vaadin.client.ui.VColorPickerArea.class, "setColor",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPickerArea) target).setColor((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VColorPickerArea.class, "setOpen",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPickerArea) target).setOpen((java.lang.Boolean) params[0]);
                return null;
              }
            });
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Type(java.lang.Boolean.class));
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", "setColor");
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", "setOpen");
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::color = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::color;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerState::class, 'color', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::popupVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::popupVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerState::class, 'popupVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::showDefaultCaption = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerState::showDefaultCaption);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerState::class, 'showDefaultCaption', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("RichTextAreaConnector", new String[] {"com.vaadin.ui.RichTextArea",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setClass("com.vaadin.ui.RichTextArea", com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class);
            store.setConstructor(com.vaadin.client.ui.VRichTextArea.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VRichTextArea.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VRichTextArea.class));
            store.setReturnType(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            loadJsBundle(store);
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerGradientConnector", new String[] {"com.vaadin.ui.components.colorpicker.ColorPickerGradient",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setClass("com.vaadin.ui.components.colorpicker.ColorPickerGradient", com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class));
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "bgColor", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorY", new Type(java.lang.Integer.class));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::bgColor = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::bgColor;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::class, 'bgColor', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorX = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorX);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::class, 'cursorX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorY = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorY);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::class, 'cursorY', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerGridConnector", new String[] {"com.vaadin.ui.components.colorpicker.ColorPickerGrid",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setClass("com.vaadin.ui.components.colorpicker.ColorPickerGrid", com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class));
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedColor", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedX", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedY", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "columnCount", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "rowCount", new Type(java.lang.Integer.class));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedColor = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedColor;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'changedColor', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedX = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedX;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'changedX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedY = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedY;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'changedY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::columnCount = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::columnCount);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'columnCount', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::rowCount = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::rowCount);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'rowCount', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
  }
}
