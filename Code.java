function doGet() {
  return HtmlService.createHtmlOutputFromFile('index')
      .setTitle('DL MYschool Website')
      .addMetaTag('viewport', 'width=device-width, initial-scale=1')
      .setXFrameOptionsMode(HtmlService.XFrameOptionsMode.ALLOWALL);
}
