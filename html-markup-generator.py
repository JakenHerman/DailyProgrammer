import webbrowser

print 'Type your paragraph here: '
p = raw_input('>>> ')


x = open('index.html', 'w')
x.write("""
<!DOCTYPE html>
<html>
    <head>
        <title></title>
    </head>

    <body>
        <p>"""+p+"""</p>
    </body>
</html>
 """)
x.close()

url = ("/home/pi/index.html")

webbrowser.open(url)
