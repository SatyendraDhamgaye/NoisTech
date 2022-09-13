<%-- 
    Document   : sampleinsta
    Created on : 14 Sep, 2019, 1:06:36 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
      import re

username_extract = 'lazada_my'
url = 'https://www.instagram.com/'+ username_extract
r = requests.get(url)
soup = BeautifulSoup(r.content,'lxml')
s = re.compile(r'"followed_by":{"count":\d*}')
for i in soup.find_all('script'):
     if 'window._sharedData' in str(i):
         print s.search(str(i.contents)).group()
        </script>
    </head>
    <body>
      
    </body>
</html>
